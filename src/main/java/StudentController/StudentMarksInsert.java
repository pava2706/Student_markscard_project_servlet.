package StudentController;

import java.io.IOException; 
import java.util.List;

import javax.servlet.RequestDispatcher;
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

		String regno = req.getParameter("regno");
		String name = req.getParameter("name");
		String dob = req.getParameter("dob");
		String father = req.getParameter("father");
		String gender = req.getParameter("gender");
		String kan1 = req.getParameter("kannada");
		int kannada = Integer.parseInt(kan1);
		String kan = req.getParameter("kannadaIM");
		int kannadaIM = Integer.parseInt(kan);
		String eng = req.getParameter("english");
		int english = Integer.parseInt(eng);
		String eng1 = req.getParameter("englishIM");
		int englishIM = Integer.parseInt(eng1);
		String hin = req.getParameter("hindi");
		int hindi = Integer.parseInt(hin);
		String hin1 = req.getParameter("hindiIM");
		int hindiIM = Integer.parseInt(hin1);
		String math = req.getParameter("maths");
		int maths = Integer.parseInt(math);
		String math1 = req.getParameter("mathsIM");
		int mathsIM = Integer.parseInt(math1);
		String sci = req.getParameter("science");
		int science = Integer.parseInt(sci);
		String sci1 = req.getParameter("scienceIM");
		int scienceIM = Integer.parseInt(sci1);
		String soc = req.getParameter("social");
		int social = Integer.parseInt(soc);
		String soc1 = req.getParameter("socialIM");
		int socialIM = Integer.parseInt(soc1);

		int tot = kannada + english + hindi + maths + science + social + kannadaIM + englishIM + hindiIM + mathsIM
				+ scienceIM + socialIM;
		double percentage = (tot/625)*100;

		StudentMarks dto = new StudentMarks();
		dto.setRegister_No(regno);
		dto.setName(name);
		dto.setDate_of_Birth(dob);
		dto.setFather_Name(father);
		dto.setGender(gender);
		dto.setKannada(kannada);
		dto.setEnglish(english);
		dto.setHindi(hindi);
		dto.setMathematics(maths);
		dto.setScience(science);
		dto.setSocialScience(social);
		dto.setKanIM(kannadaIM);
		dto.setEngIM(englishIM);
		dto.setHinIM(hindiIM);
		dto.setMathsIM(mathsIM);
		dto.setScienceIM(scienceIM);
		dto.setSocialIM(socialIM);
		dto.setTotal_Marks(tot);
		dto.setPercentage(percentage);;

		StudentMarksDao dao = new StudentMarksDao();
		dao.insert(dto);
		List<StudentMarks> l1 = dao.fetchAll();
		req.setAttribute("studentlist", l1);
		RequestDispatcher rd = req.getRequestDispatcher("markscard.jsp");
		rd.forward(req, resp);

	}
}
 