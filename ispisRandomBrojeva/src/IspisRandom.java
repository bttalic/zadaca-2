
public class IspisRandom {
public static void main(String[] args) {

	
			int minimum = 10000;
			int maximum = 100000;
			//koji je max broj ovdje?
			int broj = (int) (minimum + Math.random() * (maximum - minimum + 1));
			System.out.println("Random broj glasi: " + broj);
			System.out.println("Ispis random brojeva unaprijed");
			
			//treba li ti ovoliko varijabli ?
			int brojPet = (int) broj / 10000;
			System.out.println(brojPet);
			
			int ostatakPet = (int) broj % 10000;
			int brojCetri = (int) ostatakPet / 1000;
			System.out.println(brojCetri);
			
			int ostatakCetri = (int) ostatakPet % 1000;
			int brojTri = (int) ostatakCetri / 100;
			System.out.println(brojTri);
			
			int ostatakTri = (int) ostatakPet % 100;
			int brojDva = (int) ostatakTri / 10;
			System.out.println(brojDva);
			
			int ostatakDva = (int) ostatakPet % 10;
			int brojJedan = (int) ostatakDva / 1;
			System.out.println(brojJedan);
			
			System.out.println("Ispis random brojeva u nazad: ");
			System.out.println(brojJedan);
			System.out.println(brojDva);
			System.out.println(brojTri);
			System.out.println(brojCetri);
			System.out.println(brojPet);
		}
}
