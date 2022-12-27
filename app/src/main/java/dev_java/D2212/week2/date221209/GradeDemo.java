package dev_java.D2212.week2.date221209;

public class GradeDemo {
	String[] subject = { "JAVA", "ORACLE", "SPRING" };
	String[][] data = {
			{ "이순신", "80", "75", "70" }, { "강감찬", "90", "85", "95" }, { "김춘추", "65", "60", "60" }
	};

	void lee() {
		for (int i = 0; i < subject.length; i++) {
			System.out.println(data[0][0] + "의 " + subject[i] + "점수는" + data[0][i + 1]);
		}
	}

	void kang() {
		for (int i = 0; i < subject.length; i++) {
			System.out.println(data[1][0] + "의 " + subject[i] + "점수는" + data[1][i + 1]);
		}
	}

	void kim() {
		for (int i = 0; i < subject.length; i++) {
			System.out.println(data[2][0] + "의 " + subject[i] + "점수는" + data[2][i + 1]);
		}
	}

	int namePrint() {
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i][0]);
			System.out.println(data[0][i + 1]);
		}
		return namePrint();
	}

	// 자바 점수의 합은?
	int javaTot() {
		int javaHap = 0;
		for (int i = 0; i < data.length; i++) {
			javaHap += Integer.parseInt(data[i][1]);
		}
		return javaHap;
	}

	void allTot() {
		int javaHap = 0;
		for (int i = 0; i < data.length; i++) {
			javaHap += Integer.parseInt(data[i][1]);
		}
		System.out.println("자바 총점은 ? " + javaHap);

		int oracleHap = 0;
		for (int i = 0; i < data.length; i++) {
			oracleHap += Integer.parseInt(data[i][2]);
		}
		System.out.println("오라클 총점은 ? " + oracleHap);

		int springHap = 0;
		for (int i = 0; i < data.length; i++) {
			springHap += Integer.parseInt(data[i][2]);
		}
		System.out.println("스프링 총점은 ? " + springHap);
	}

	public static void main(String[] args) {
		GradeDemo gd = new GradeDemo();
		// gd.namePrint();
		gd.javaTot();
		// System.out.println(gd.javaTot());
		// gd.allTot();
		gd.lee();
		System.out.println("=======");
		gd.kang();
		System.out.println("===========");
		gd.kim();

	}
}