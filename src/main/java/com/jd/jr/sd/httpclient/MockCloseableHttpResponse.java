/**
 * @author liuifengyi
 *  下午5:19:40
 * @version 1.0
 * 文件描述
 */
package com.jd.jr.sd.httpclient;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpEntity;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolVersion;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicListHeaderIterator;
import org.apache.http.message.BasicStatusLine;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HTTP;

/**
 * 
  * @author liuifengyi
 *  下午5:19:40
 * @version 1.0
 * 类描述
 *  
 */
public class MockCloseableHttpResponse implements CloseableHttpResponse {

	private String content;
	private StatusLine statusLine = new BasicStatusLine(HttpVersion.HTTP_1_1, 200, "OK");;
	
	private Map<String, Header[]> headerMap = new HashMap<String, Header[]>();

	public MockCloseableHttpResponse(String response) {
		this.content = response;
		Header contentLengthHeader = new BasicHeader(HTTP.CONTENT_LEN, content.length() + "");
		headerMap.put(HTTP.CONTENT_LEN, new Header[] { contentLengthHeader });
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.http.HttpResponse#getStatusLine()
	 */
	@Override
	public StatusLine getStatusLine() {
		// TODO Auto-generated method stub
		return this.statusLine;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.http.HttpResponse#setStatusLine(org.apache.http.StatusLine)
	 */
	@Override
	public void setStatusLine(StatusLine statusline) {
		this.statusLine = statusline;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.apache.http.HttpResponse#setStatusLine(org.apache.http.ProtocolVersion,
	 * int)
	 */
	@Override
	public void setStatusLine(ProtocolVersion ver, int code) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.apache.http.HttpResponse#setStatusLine(org.apache.http.ProtocolVersion,
	 * int, java.lang.String)
	 */
	@Override
	public void setStatusLine(ProtocolVersion ver, int code, String reason) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.http.HttpResponse#setStatusCode(int)
	 */
	@Override
	public void setStatusCode(int code) throws IllegalStateException {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.http.HttpResponse#setReasonPhrase(java.lang.String)
	 */
	@Override
	public void setReasonPhrase(String reason) throws IllegalStateException {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.http.HttpResponse#getEntity()
	 */
	@Override
	public HttpEntity getEntity() {
		// TODO Auto-generated method stub
		HttpEntity entity = null;
		try {
			entity = new StringEntity(content);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return entity;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.http.HttpResponse#setEntity(org.apache.http.HttpEntity)
	 */
	@Override
	public void setEntity(HttpEntity entity) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.http.HttpResponse#getLocale()
	 */
	@Override
	public Locale getLocale() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.http.HttpResponse#setLocale(java.util.Locale)
	 */
	@Override
	public void setLocale(Locale loc) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.http.HttpMessage#getProtocolVersion()
	 */
	@Override
	public ProtocolVersion getProtocolVersion() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.http.HttpMessage#containsHeader(java.lang.String)
	 */
	@Override
	public boolean containsHeader(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.http.HttpMessage#getHeaders(java.lang.String)
	 */
	@Override
	public Header[] getHeaders(String name) {
		// TODO Auto-generated method stub
		return headerMap.get(name);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.http.HttpMessage#getFirstHeader(java.lang.String)
	 */
	@Override
	public Header getFirstHeader(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.http.HttpMessage#getLastHeader(java.lang.String)
	 */
	@Override
	public Header getLastHeader(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.http.HttpMessage#getAllHeaders()
	 */
	@Override
	public Header[] getAllHeaders() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.http.HttpMessage#addHeader(org.apache.http.Header)
	 */
	@Override
	public void addHeader(Header header) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.http.HttpMessage#addHeader(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public void addHeader(String name, String value) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.http.HttpMessage#setHeader(org.apache.http.Header)
	 */
	@Override
	public void setHeader(Header header) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.http.HttpMessage#setHeader(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public void setHeader(String name, String value) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.http.HttpMessage#setHeaders(org.apache.http.Header[])
	 */
	@Override
	public void setHeaders(Header[] headers) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.http.HttpMessage#removeHeader(org.apache.http.Header)
	 */
	@Override
	public void removeHeader(Header header) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.http.HttpMessage#removeHeaders(java.lang.String)
	 */
	@Override
	public void removeHeaders(String name) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.http.HttpMessage#headerIterator()
	 */
	@Override
	public HeaderIterator headerIterator() {
		
		return null;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.http.HttpMessage#headerIterator(java.lang.String)
	 */
	@Override
	public HeaderIterator headerIterator(String name) {
		Header[] header = headerMap.get(name);
		List<Header> headerList = new ArrayList<Header>();
		if(header != null) {
			for(int i = 0;i <header.length; i++) {
				headerList.add(header[i]);
			}
		}
		HeaderIterator basicListHeaderIterator = new BasicListHeaderIterator(headerList, name);
		return basicListHeaderIterator;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.http.HttpMessage#getParams()
	 */
	@Override
	public HttpParams getParams() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.http.HttpMessage#setParams(org.apache.http.params.HttpParams)
	 */
	@Override
	public void setParams(HttpParams params) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.io.Closeable#close()
	 */
	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub

	}


}
