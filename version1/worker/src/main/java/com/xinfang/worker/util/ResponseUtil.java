package com.xinfang.worker.util;


import java.io.PrintWriter;
import javax.servlet.http.HttpServletResponse;

public class ResponseUtil {
	// 输出Json数据

	public static void write(HttpServletResponse response, Object object) throws Exception {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println(object);
		out.flush();
		out.close();
	}
}