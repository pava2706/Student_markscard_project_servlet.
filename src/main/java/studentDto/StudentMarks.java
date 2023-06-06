package studentDto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentMarks {

	@Id
	private String Register_No;
	private String Name;
	private String Date_of_Birth;
	private String Father_Name;
	private String Gender;
	private int Kannada;
	private int English;
	private int Hindi;
	public String getRegister_No() {
		return Register_No;
	}
	public void setRegister_No(String register_No) {
		Register_No = register_No;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDate_of_Birth() {
		return Date_of_Birth;
	}
	public void setDate_of_Birth(String date_of_Birth) {
		Date_of_Birth = date_of_Birth;
	}
	public String getFather_Name() {
		return Father_Name;
	}
	public void setFather_Name(String father_Name) {
		Father_Name = father_Name;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public int getKannada() {
		return Kannada;
	}
	public void setKannada(int kannada) {
		Kannada = kannada;
	}
	public int getEnglish() {
		return English;
	}
	public void setEnglish(int english) {
		English = english;
	}
	public int getHindi() {
		return Hindi;
	}
	public void setHindi(int hindi) {
		Hindi = hindi;
	}
	public int getMathematics() {
		return Mathematics;
	}
	public void setMathematics(int mathematics) {
		Mathematics = mathematics;
	}
	public int getScience() {
		return Science;
	}
	public void setScience(int science) {
		Science = science;
	}
	public int getSocialScience() {
		return SocialScience;
	}
	public void setSocialScience(int socialScience) {
		SocialScience = socialScience;
	}
	public int getTotal_Marks() {
		return Total_Marks;
	}
	public void setTotal_Marks(int total_Marks) {
		Total_Marks = total_Marks;
	}
	
	public double getPercentage() {
		return Percentage;
	}
	public void setPercentage(double percentage) {
		Percentage = percentage;
	}
	public int getKanIM() {
		return KanIM;
	}
	public void setKanIM(int kanIM) {
		KanIM = kanIM;
	}
	public int getEngIM() {
		return EngIM;
	}
	public void setEngIM(int engIM) {
		EngIM = engIM;
	}
	public int getHinIM() {
		return HinIM;
	}
	public void setHinIM(int hinIM) {
		HinIM = hinIM;
	}
	public int getMathsIM() {
		return MathsIM;
	}
	public void setMathsIM(int mathsIM) {
		MathsIM = mathsIM;
	}
	public int getScienceIM() {
		return ScienceIM;
	}
	public void setScienceIM(int scienceIM) {
		ScienceIM = scienceIM;
	}
	public int getSocialIM() {
		return SocialIM;
	}
	public void setSocialIM(int socialIM) {
		SocialIM = socialIM;
	}
	private int Mathematics;
	private int Science;
	private int SocialScience;
	private int Total_Marks;
	private double Percentage;
	private int KanIM;
	private int EngIM;
	private int HinIM;
	private int MathsIM;
	private int ScienceIM;
	private int SocialIM;

	

	

}
