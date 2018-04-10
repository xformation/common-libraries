/**
 * 
 */
package com.synectiks.commons.entities.oak;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLConnection;
import java.nio.file.attribute.FileTime;
import java.util.Date;

import javax.jcr.PropertyType;
import javax.jcr.nodetype.NodeType;

import org.apache.commons.io.FilenameUtils;
import org.apache.jackrabbit.ocm.manager.atomictypeconverter.impl.UndefinedTypeConverterImpl;
import org.apache.jackrabbit.ocm.mapper.impl.annotation.Field;
import org.apache.jackrabbit.ocm.mapper.impl.annotation.Node;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.synectiks.commons.utils.IUtils;

/**
 * @author Rajesh
 */
@Node(jcrType = NodeType.NT_UNSTRUCTURED)
public class OakFileNode extends OakEntity {

	private static final long serialVersionUID = 3473027035476995787L;

	@Field(jcrType = PropertyType.TYPENAME_STRING)
	private String name;
	@Field(jcrType = PropertyType.TYPENAME_STRING)
	private String contentType;
	@Field(jcrType = PropertyType.TYPENAME_STRING)
	private String encoding;
	@Field(jcrType = PropertyType.TYPENAME_STRING)
	private String path;
	@Field(jcrType = PropertyType.TYPENAME_BINARY,
			converter = UndefinedTypeConverterImpl.class)
	private InputStream data;

	public String getName() {
		return name;
	}

	public String getContentType() {
		return contentType;
	}

	public String getEncoding() {
		return encoding;
	}

	public String getPath() {
		return path;
	}

	public InputStream getData() {
		return data;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public void setData(InputStream data) {
		this.data = data;
	}

	public void setData(String data) {
		this.data = IUtils.convertStringToStream(data);
	}

	@Override
	public String toString() {
		try {
			return IUtils.OBJECT_MAPPER.writeValueAsString(this);
		} catch (JsonProcessingException e) {
			IUtils.logger.error("OakFileNode: " + e.getMessage(), e);
		}
		return null;
	}

	/**
	 * Method to create an oak file node from file
	 * @param jcrNodePath
	 * @param file
	 * @return
	 */
	public static OakFileNode createNode(String jcrNodePath, File file) {
		OakFileNode node = new OakFileNode();
		try {
			if (!IUtils.isNullOrEmpty(jcrNodePath)) {
				node.setJcrPath(jcrNodePath);
			}
			node.setContentType(URLConnection.guessContentTypeFromName(file.getName()));
			FileTime dt = IUtils.getFileAttribute(file, "createdAt");
			node.setCreatedAt(new Date(dt.toMillis()));
			dt = IUtils.getFileAttribute(file, "updatedAt");
			node.setUpdatedAt(new Date(dt.toMillis()));
			node.setName(FilenameUtils.getName(file.getName()));
			node.setPath(file.getAbsolutePath());
			FileInputStream fis = new FileInputStream(file);
			node.setEncoding(new InputStreamReader(fis).getEncoding());
			node.setData(fis);
			return node;
		} catch (Throwable th) {
			th.printStackTrace();
		}
		return null;
	}

}
