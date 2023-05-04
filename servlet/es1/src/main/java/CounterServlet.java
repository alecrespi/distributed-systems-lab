import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CounterServlet", urlPatterns = {"/counter"})
public class CounterServlet extends HttpServlet{
	private Counter counter;

	public CounterServlet(){
		super();
		this.counter = new Counter();
	}

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String dom = ("<!DOCTYPE html>\n" +
				"<html lang=\"en\">\n" +
				"<head>\n" +
				"    <meta charset=\"UTF-8\">\n" +
				"    <title>Title</title>\n" +
				"</head>\n" +
				"<body>\n" +
				"<h2>Counter (Java Servlet Example)</h2>\n" +
				"<p>this is a counter: " + this.counter.increase() + "</p>\n" +
				"<p>back to <a href='/'>HOME</a> or <a href='/counter'>RELOAD</a> to update the counter </p>\n" +
				"</body>\n" +
				"</html>\n");
		res.getOutputStream().println(dom);
	}

}