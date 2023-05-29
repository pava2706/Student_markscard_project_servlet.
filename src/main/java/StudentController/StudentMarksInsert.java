package StudentController;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import studentDao.StudentMarksDao;
import studentDto.StudentMarks;

@WebServlet("/insert")
public class StudentMarksInsert extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doPost(req, resp);

		String reg = req.getParameter("regno");
		int regno = Integer.parseInt(reg);
		String name = req.getParameter("name"); 
		String dob = req.getParameter("dob");
		String father = req.getParameter("father");
		String kan1 = req.getParameter("kannada");
		int kannada = Integer.parseInt(kan1);
		String eng = req.getParameter("english");
		int english = Integer.parseInt(eng);
		String hin = req.getParameter("hindi");
		int hindi = Integer.parseInt(hin);
		String math = req.getParameter("maths");
		int maths = Integer.parseInt(math);
		String sci = req.getParameter("science");
		int science = Integer.parseInt(sci);
		String soc = req.getParameter("social");
		int social = Integer.parseInt(soc);

		int tot = kannada + english + hindi + maths + science + social;
		String percentage = tot / 6 +"%";

		StudentMarks dto = new StudentMarks();
		dto.setRegister_No(regno);
		dto.setName(name);
		dto.setDate_of_Birth(dob);
		dto.setFather_Name(father);
		dto.setKannada(kannada);
		dto.setEnglish(english);
		dto.setHindi(hindi);
		dto.setMathematics(maths);
		dto.setScience(science);
		dto.setSocialScience(social);
		dto.setTotal_Marks(tot);
		dto.setPercentage(percentage);

		StudentMarksDao dao = new StudentMarksDao();
		String msg = dao.insert(dto);
		resp.getWriter().println(msg+" --------------------->");
		
		resp.setContentType("text/html");
		
		resp.getWriter().print("<a href='kseeb.html'>back to kseeb</a>");
	}

}
