package sda.java9.wpj.advanced.oop.course;

import sda.java9.wpj.advanced.oop.course.people.*;
import sda.java9.wpj.advanced.oop.course.items.*;
import sda.java9.wpj.advanced.oop.course.rooms.*;
import sda.java9.wpj.advanced.oop.course.content.*;

public class CoursePlay {
    
    /*
     * Nasza metoda main jest realizacją sztuki pod tytułem "Kurs Java"
     *
     * Kolejne jej fragmenty odpowiadają sceną, które rozgrywają się w jednym
     * z 3 aktów.
     */
    public static void main(String[] args) {
		
		boolean stage1SOP = false;
		boolean stage2SOP = false;
		boolean stage3SOP = true;
		
		System.out.println("================================SCENA 1================================");
        
        /* 1. Pojawia się pierwszy Uczestnik kursu. 
         *
         * Hint:
         * Pojawienie się pierwszego uczestnika kursu oznacza
         * konieczność stworzenia nowego obiektu reprezentującego
         * tego uczestnika
         */
        Trainee firstTrainee = new Trainee();
        firstTrainee.setName("Michał Cz.");
		firstTrainee.setPlec('M');
        
        /* 2. Uczestnik Kursu próbuje wejść do Sali szkoleniowej, ale jest zamknięta.
         *
         * Hint:
         * Scena wymaga sali szkoleniowej. W naszym przypadku sala szkoleniowa
         * zostanie stworzona z konstruktorem jednoparametrowym, który przyjmuje
         * jako parametr maksymalną ilość uczestników zajęć w sali
         *
         * Tworzymy kod obiektowy, więc nasz obiekt reprezentujący uczestnika
         * próbuje wejść do naszej sali { firstTrainee.enter(ourRoom) }
         * Operacja ta nie musi zakończyć się powodzeniem.
         */
        ClassRoom ourRoom = new ClassRoom(20);
        boolean success = firstTrainee.enter(ourRoom);
        stageDirections("Czy udalo sie wejsc do sali? " + success, stage1SOP);
        
        /* 3. Pojawia się Menedżer kursu i przedstawia się. Uczestnik kursu przedstawia się.
         *
         * Hint:
         * Podobnie jak wcześniej, potrzebujemy obiektu, który będzie reprezentował menedżera
         * kursu. Zarówno menedżer jak i uczestnik muszą umieć się przywitać. Każda z tych klas
         * inaczej definiuje co powie uczestnik a co powie menedżer.
         * 
         * Zwróćmy uwagę, że ani menedżer ani uczestnik nie "mówią" swojego powitania
         * bezpośrednio do konsoli, ale zwracają obiekt String reprezentujący tekst
         * ich powitania. To sztuka (SCENARZYSTA) decyduje co z tym zrobi - czy wyświetli na konsoli,
         * czy użyje mikrofonu i usłyszą to widzowie, czy może nagra ten tekst na kasecie lub
         * zapisze w formie scenariusza.
         */
        CourseManager manager = new CourseManager();
        manager.setFirstName("Krzysiu");
        manager.setLastName("M.");
        manager.setPhoneNumber("800-800-800");
        manager.setEmail("krzysztof.mmm@sda.pl");

        say("Manadżer " + manager.getFirstName(), manager.sayGreetings(), stage1SOP);
        say("Uczestnik " + firstTrainee.getName(), firstTrainee.sayGreetings(), stage1SOP);
        
        /* 4. Menedżer kursu otwiera Salę szkoleniową i wchodzi do niej.
         *
         * Hint:
         * Podobnie jak mieliśmy w przypadku uczestnika kursu, tak i tutaj,
         * tworzymy kod obiektowy, a więc obiekt menedżera najpierw
         * otwiera konkretną salę:
         * 
           manager.openRoom(ourRoom);
         *
         * a następnie do niech wchodzi:
         *
           manager.enterRoom(ourRoom);
         *
         * W przeciwieństwie do uczestnika, menedżer salę może otworzyć.
         * Po otwarciu sali, ta konkretna sala - obiekt ourRoom, zmienił swój stan,
         * tzn. teraz ta sala jest otwarta i również uczestnik może do niej wejść.
         */
        manager.openRoom(ourRoom);
        manager.enterRoom(ourRoom);
        stageDirections("Sala, w której jest menedżer: " + manager.getRoom(), stage1SOP);
        
        /* 5. Uczestnik wchodzi do sali
         *
         * Hint:
         * Teraz kod, który mieliśmy w scenie 2 zwróci nam powodzenie
         * operacji, ponieważ sala jest już otwarta i uczestnik może do 
         * niej wejść.
         */
        success = firstTrainee.enter(ourRoom);
        stageDirections("Czy udalo sie wejsc do sali? " + success, stage1SOP);
        stageDirections("Nasz uczestnik dla JVM wygląda tak: " + firstTrainee, stage1SOP);
        stageDirections("A jakie obiekty uczestników mamy w sali? " 
                            + (java.util.Arrays.toString(ourRoom.getTrainees())), stage1SOP);
        stageDirections("Nasz menedżer dla JVM wygląda tak: " + manager, stage1SOP);
        stageDirections("A jaki obiekt menedżera mamy w sali? " 
                            + (ourRoom.getCourseManager()), stage1SOP);
        
        /* 6. Pojawiają się pozostali Uczestnicy
         *
         * Hint:
         * Wymaga to od nas stworzenia obiektów pozostałych uczestników.
         * Ze względu na to, że jest ich dużo, to będziemy ich przechowywać w tablicy
         * a nie w poszczególnych zmiennych. W ten sposób będziemy mogli na nich operować
         * zbiorowo.
         */
        Trainee[] trainees = new Trainee[11];
        // Pierwszego uczestnika mamy już stworzonego, więc go przypisujemy
        // do elementy pod indeksem 0. Od tej pory nie będziemy już używam zmiennej firstTrainee.
        trainees[0] = firstTrainee;
        // Jeżeli chcemy skorzystać z konstruktora bezparametrowego, który tworzy obiekt
        // Trainee, to potem musimy pamiętać, aby ustawić przynajmniej imię tego uczestnika.
        trainees[1] = new Trainee();
        trainees[1].setName("Krysia T.");
		trainees[1].setPlec('K');
        // Wygodniej jest utworzyć obiekt z wykorzystaniem konstruktora z jednym parametrem.
        trainees[2] = new Trainee("Artur K.", 'M');
        trainees[3] = new Trainee("Norbert W.", 'M');
        trainees[4] = new Trainee("Michał K.", 'M');
        trainees[5] = new Trainee("Krzysztof M.", 'M');
        trainees[6] = new Trainee("Wojtek S.", 'M');
        trainees[7] = new Trainee("Michał Rz.", 'M');
        trainees[8] = new Trainee("Sebastian M.", 'M');
        trainees[9] = new Trainee("Jacek Z.", 'M');
        trainees[10] = new Trainee("Grzesiek G.", 'M');
        stageDirections("Nasi uczestnicy oczami JVM: " + java.util.Arrays.toString(trainees), stage1SOP);
        
        
        /* 7. Uczestnicy wchodzą do Sali szkoleniowej.
         *
         * Hint:
         * Tą sytuację już znamy. Teraz tylko zamiast korzystać ze zmiennej
         * wskazującej na obiekt konkretnego uczestnika, to skorzystamy
         * z tablicy, której każdy element wskazuje na obiekt innego uczestnika.
         *
         * Musimy pamiętać, że pierwszy uczestnik (pod indeksem 0), już jest w sali,
         * więc uczestnicy wchodzą licząc od 2 (czyli od indeksu 1).
         */
        for (int i = 1; i < trainees.length; i++) {
            trainees[i].enter(ourRoom);
        }
        stageDirections("Jacy uczestnicy są w sali? " + java.util.Arrays.toString(ourRoom.getTrainees()), stage1SOP);    
        
        /* 8. Uczestnicy przedstawiają się [do tej pory wszyscy stoją].
         *
         * Hint:
         * Również ten przypadek jest dla nas prosty. Wiemy jak uczestnik może się przedstawić.
         * Teraz, wykorzystując tablicę, poprosimy wszystkich uczestników, aby się przedstawili.
         * Również pierwszego, ponieważ teraz będzie się przedstawiał innym.
         */
        for (Trainee trainee : trainees) {
            say("Uczestnik " + trainee.getName(), trainee.sayGreetings(), stage1SOP);
        }
        
        /* 9. Pojawia się Trener, wchodzi do Sali i przedstawia się
         *
         * Hint:
         * Tym razem potrzebujemy stworzyć nowy obiekt trenera i analogicznie
         * jak dla uczestnika i menedżera kursu - wyświetlić jego powitanie.
         */
        Trainer theTrainer = new Trainer();
        // Zamiast korzystać z metody setName powinniśmy stworzyć nowy konstruktor dla obiektu Trainer
        theTrainer.setName("On");
        // ... zróbmy tak:
        theTrainer = new Trainer("On");
        // Zauważmy, że nadpisaliśmy zmienną theTrainer referencją do nowego obiektu trenera.
        // Poprzednio utworzony obiekt zostanie wyczyszczony z pamięci przez JVM
        theTrainer.enterRoom(ourRoom);
        stageDirections("Jaki trener jest w pokoju? " + ourRoom.getTrainer(), stage1SOP);
        say("Trener", theTrainer.sayGreetings(), stage1SOP);
        
        /* 10. Uczestnicy wybierają Ławki i Krzesła, siadają.
         *
         * Hint:
         * Teraz potrzebujemy zapełnić obiekt sali szkoleniowej (ourRoom)
         * ławkami i krzesłami. Popatrzmy na klasę ClassRoom i zastanówmy się jak to zrobić.
         * Możemy przyjąć, że w sali jest 10 ławek, każda ławka ma po 2 krzesła.
         * Alternatywnie, możemy przyjać, że w sali jest tyle ławek, aby zmieścili się wszyscy
         * uczestnicy (popatrz na klasę ClassRoom). Czyli:
         *
         * liczba uczestników \ 2 + 1 
         *
         * (czemu " + 1" ? ).
         * 
         * Zastanów się również, czy powinniśmy tutaj, w sztuce tworzyć te wszystkie stoły i krzesła
         * czy może powinny one powstać gdzie indzie? Np. ... w konstruktorze klasy ClassRoom?
         */

		pickSeat(trainees, ourRoom, stage1SOP);
		for (int i = 0; i < trainees.length; i++) {
            trainees[i].sit();
        }		
        
        /* 11. Menedżer kursu opowiada o Kursie, przedstawia informacje ogólne
         *
         * Hint:
         * Po pierwsze potrzebujemy kursu, o którym menedżer ma opowiadać.
         * Sam menedżer mógłby wiedzieć dokładnie co powiedzieć na temat konkretnego kursu
         * ale lepiej, gdy menedżer umie opowiedzieć podstawowe informacje, o każdym kursie
         * który mu przekażemy jako parametr (spójrz na implementacje metody sayCourseInfo w klasie CourseManager)
         */
        Course sdaJava = new Course();
        sdaJava.setTitle("Java");
        sdaJava.setShortDescription("Kurs Java uczy kodowania, programowania i rozwiązywania problemów!");
        say("Menedżer", manager.sayCourseInfo(sdaJava), stage1SOP);
		
		/* 12. Trener opowiada o Kursie, przedstawia informacje techniczne. 
         *
         * Hint:
         * Będzie to bardzo podobny kod, do tego, który napisaliśmy dla klasy CourseManager
         * z tą różnicą, że w klasie Trainer będziemy wykorzystywać inne pole klasy Course
         */
         sdaJava.setLongDescription("Kurs Java nauczy Was składni Javy, technik programowania, "
			+ "programowania samego w sobie, abyście umieli rozwiązywać problemy programistyczne, "
			+ "również poznacie wiele użytecznych bibliotek, narzędzi oraz framework-ów");
         say("Trener", theTrainer.sayCourseDetails(sdaJava), stage1SOP);
		
		/* 13. Trener opowiada o Blokach kursu, które prowadzi – przedstawia informacje ogólne i techniczne.
         *
         * Hint:
         * Aby trener opowiedział o blokach kursu, to muszą one powstać.
         * Dodatkowo, każdy blok może być prowadzony przez innego trenera, więc konkretny
         * trener powinien opowiedzieć tylko o swoich blokach.
         * Alternatywnie można zrobić tak, że trener opowiada ogólnie o każdym bloku, a szczegółowo
         * o blokach, które sam prowadzi
         */
        CourseBlock wpj = new CourseBlock("Wprowadzenie do języka Java", "16 lekcji o języku Java",
			"16 lekcji o języku Java, w szczególności: podstawy języka, składnia, typy, wyjątki, itd.",
			theTrainer);
        // Tutaj null jako ostatni argument oznacza, że ten blok w ogóle nie ma trenera
        // czyli też na pewno nasz trener nie jest trenerem do tego bloku (żaden nie jest)
		CourseBlock git = new CourseBlock("Podstawy GIT", "2 lekcję o GIT",
            "2 lekcje o GIT, w szczególności: czym jest, tworzenie repozytorium, używanie repozytorium", null);
        CourseBlock prog1 = new CourseBlock("Programowanie 1", "12 lekcji z nauki programowania",
			"12 lekcji z nauki programowania, w szczególności nauczymy się jak programować", theTrainer);
        CourseBlock jvm = new CourseBlock("Wprowadzenie do JVM", "2 lekcje o JVM",
			"2 lekcje o JVM czyli o maszynie wirtualnej Java i jej narzędzia", theTrainer);
        // Znowu nasz trener nie prowadzi tego kursu
        CourseBlock tdd = new CourseBlock("TDD", "5 lekcji o TDD",
			"5 lekcji o TDD czyli o tworzeniu testów jednostkowych i narzędziach testów jednostkowych", null);
            
        // Wszystkie utworzone bloki wsadzamy w tabele i zapisujemy w kursie
		CourseBlock[] blocks = new CourseBlock[] {wpj, git, prog1, jvm, tdd};
		sdaJava.setBlocks(blocks);
        
        // Trener teraz opowie nam o prowadzonych przez siebie blokach.
        // My sami mu nie wskażemy jakie to są. Poprosimy go znowu o opowiedzenie o swoich blokach
        // z jakiegoś kursu, a to trener będzie wiedział, o których coś powiedzieć, a o których nie
		say("Trener", theTrainer.sayMyCourseBlocksInfo(sdaJava), stage1SOP);
		
		// SCENA 2
		
		System.out.println("================================SCENA 2================================");
		
		//===================================================================================================================		
		stageAkcion("1 Trener ogłasza przerwę", stage2SOP);
		
		say(theTrainer.getName(), "Oglaszam przerwe!", stage2SOP);
		
		//===================================================================================================================		
		stageAkcion("2 Menedżer kursu opuszcza Salę i Kurs.", stage2SOP);
		
		manager.leave();
		stageDirections("Jaki manager jest w pokoju? " + ourRoom.getCourseManager(), stage2SOP);
		
		//===================================================================================================================		
		stageAkcion("3 Uczestnicy wstają i wychodzą z Sali.", stage2SOP);
		
		for (int i = 0; i < trainees.length; i++){
			trainees[i].stand();
			ourRoom.removeTrainee(trainees[i]);
		}
		String chairs = "";
		for (int i = 0; i < ourRoom.getChairs().length; i++){
			chairs = chairs + ourRoom.getChairs()[i].getUseOfChair() +", ";
		}
		stageDirections("Jakie krzesla sa w uzyciu? " + chairs, stage2SOP);
		stageDirections("Jacy uczestnicy są w sali? " + getNames(ourRoom.getTrainees()), stage2SOP);
		
		//===================================================================================================================		
		stageAkcion("4 Od 2 do 6 uczestników idzie do Toalet. Uczestnicy mogą być różnych płci. Toalety nie są koedukacyjne.", stage2SOP);
		
		Toilet male = new Toilet('M', 4);
		Toilet female = new Toilet('D', 4);
		int traineesInToilet = 2 + (int) (5 * Math.random());
		stageDirections(traineesInToilet + " uczestnikow idzie do Toalety", stage2SOP);
		goToilet(trainees, traineesInToilet, male, female);
		String name;
		if (male.getOccupant() == null){
			name = "null";
		} else {
			name = male.getOccupant().getName();
		}
		stageDirections("Uczestnik w toalecie meskiej: " + name, stage2SOP);
		stageDirections("Kolejka do toalety meskiej: " + getNames(male.getLine()), stage2SOP);
		if (female.getOccupant() == null){
			name = "null";
		} else {
			name = female.getOccupant().getName();
		}
		stageDirections("Uczestnik w toalecie damskiej: " + name, stage2SOP);
		stageDirections("Kolejka do toalety damskiej: " + getNames(female.getLine()), stage2SOP);
		
		//===================================================================================================================		
		stageAkcion("5 Pozostali Uczestnicy idą do kuchni. Każdy z Uczestników bierze w kuchni Kubek.", stage2SOP);
		
		Kitchen kitchen = new Kitchen(trainees.length);
		for (int i = 0; i < trainees.length; i++){
			if (!trainees[i].getInToilet()){
				kitchen.addTrainee(trainees[i]);
				trainees[i].setCup(kitchen.getCup(i));
			}
		}
		for (int i = 0; i < trainees.length; i++){
			say(trainees[i].getName(), "Moj kubek to: " + trainees[i].getCup(), stage2SOP);
		}
		
		//===================================================================================================================		
		stageAkcion("6 Część Uczestników robi kawę w Automacie do kawy, część nalewa sobie wodę w Automacie z wodą (proporcje 75% do 25%).", stage2SOP);
		
		String content = "";
		int woda = (trainees.length - traineesInToilet) / 4;
		int traineesInKitchen = trainees.length - traineesInToilet;
		for (int i = 0; i < traineesInKitchen; i++){
			if (i < woda){
				kitchen.getWaterMachine().fill(kitchen.getTrainees()[i].getCup());
			} else {
				kitchen.getCoffeeMachine().fill(kitchen.getTrainees()[i].getCup());
			}
			content = content + kitchen.getTrainees()[i].getCup().getContent() + ", ";
		}
		stageDirections("Uczestnicy w kuchni: " + getNames(kitchen.getTrainees()), stage2SOP);
		stageDirections("Zawartosc kubkow: " + content, stage2SOP);
		
		//===================================================================================================================		
		stageAkcion("7 Połowa z Uczestników, którzy byli w Toaletach przychodzi do kuchni zrobić sobie kawę.", stage2SOP);
		
		int traineesInToilet2 = traineesInToilet / 2;
		while (traineesInToilet2 != 0) {
			for (int i = 0; i < trainees.length; i++){
				if (trainees[i].getInToilet()) {
					kitchen.addTrainee(trainees[i]);
					traineesInKitchen++;
					trainees[i].setCup(kitchen.getCup(i));
					kitchen.getCoffeeMachine().fill(trainees[i].getCup());
					trainees[i].setInToilet(false);
					break;
				}
			}
			traineesInToilet2--;
		}
		content = "";
		for (int i = 0; i < traineesInKitchen; i++){
			content = content + kitchen.getTrainees()[i].getCup().getContent() + ", ";
		}
		male.emptyToilet();
		female.emptyToilet();
		
		if (male.getOccupant() == null){
			name = "null";
		} else {
			name = male.getOccupant().getName();
		}
		stageDirections("Uczestnik w toalecie meskiej: " + name, stage2SOP);
		stageDirections("Kolejka do toalety meskiej: " + getNames(male.getLine()), stage2SOP);
		if (female.getOccupant() == null){
			name = "null";
		} else {
			name = female.getOccupant().getName();
		}
		stageDirections("Uczestnik w toalecie damskiej: " + name, stage2SOP);
		stageDirections("Kolejka do toalety damskiej: " + getNames(female.getLine()), stage2SOP);
		stageDirections("Uczestnicy w kuchni: " + getNames(kitchen.getTrainees()), stage2SOP);
		stageDirections("Zawartosc kubkow: " + content, stage2SOP);
		
		//===================================================================================================================
		stageAkcion("8 Wszyscy Uczestnicy wracają na Salę i zajmują te same miejsca, co wcześniej.", stage2SOP);
		
		for (int i = 0; i < trainees.length; i++) {
            trainees[i].enter(ourRoom);
			trainees[i].sit();
        }
        stageDirections("Jacy uczestnicy są w sali? " + getNames(ourRoom.getTrainees()), stage2SOP);
		chairs = "";
		for (int i = 0; i < ourRoom.getChairs().length; i++){
			chairs = chairs + ourRoom.getChairs()[i].getUseOfChair() +", ";
		}
		stageDirections("Jakie krzesla sa w uzyciu? " + chairs, stage2SOP);		
		
		
		
		// SCENA 3
		
		System.out.println("================================SCENA 3================================");
		
		//===================================================================================================================
		stageAkcion("1.Trener włącza Projektor.", stage3SOP);
		
		Projector projector = new Projector();
		theTrainer.turnProjectorOn(projector);
		stageDirections("Czy projektor jest wlaczony? " + projector.getIsOn(), stage3SOP);
		
		//2.Trener wyświetla na Projektorze treść bloku „Wprowadzenie do Java”.
		
		
		
		//3.Trener czyści Tablicę.
		//4.Trener rysuje na Tablicy jak wygląda typ prymitywny.
		//5.Jeden z Uczestników (losowy) rysuje na Tablicy złowrogie rysunki.
		//6.Trener rysuje na Tablicy jak wygląda typ referencyjny, ale wcześniej, jeżeli na Tablicy są złowrogie rysunki, to je zmazuje
		//7.Trener dziękuję Uczestnikom za udział w zajęciach i kończy Blok kursu „Wprowadzenie do Java”,
		//8.Trener wyłącza Projektor.
		//9.Uczestnicy wstają i wychodzą z Sali.
		//10.Trener wychodzi z Sali i zamyka ją.
		
    } 
	
	private static void goToilet(Trainee[] trainees, int traineesInToilet, Toilet male, Toilet female){
		int[] places = new int[trainees.length];
		int notUsed = (places.length - 1);
		for (int i = 0; i < places.length; i++){
			places[i] = i;
		}
		for (int i = 0; i < traineesInToilet; i++){
			int randTrainee = (int) (notUsed * Math.random());
			if (trainees[places[randTrainee]].getPlec() == 'M'){
				trainees[places[randTrainee]].goToilet(male);
			} else {
				trainees[places[randTrainee]].goToilet(female);
			}
			int temp =  places[notUsed];
			places[notUsed] = places[randTrainee];
			places[randTrainee] = temp;
			notUsed--;
		}
	}
	
	private static void pickSeat(Trainee[] trainees, ClassRoom classRoom, boolean sop){
		int[] places = new int[classRoom.getChairs().length];
		int notUsed = (places.length - 1);
		for (int i = 0; i < places.length; i++){
			places[i] = i;
		}
		for (int i = 0; i < trainees.length; i++){
			int randPlace = (int) (notUsed * Math.random());
			trainees[i].setMyChair(classRoom.getChairs()[places[randPlace]]);
			int temp =  places[notUsed];
			places[notUsed] = places[randPlace];
			places[randPlace] = temp;
			notUsed--;
			say (trainees[i].getName(), ("Wybieram siedzenie " + trainees[i].getMyChair()), sop);
		}
	}
	
    private static void stageDirections(String msg, boolean print) {
        if (print) {
			System.out.println("====> Didaskalia\n" + msg + "\n====");
		}
    }
    
    private static void say(String who, String what, boolean print) {
		if (print) {
			System.out.println(who + ": \n" + "    \"" + what + "\"");
		}
    }
	
	private static String getNames(Trainee[] trainees){
		String sg = "";
		for (int i = 0; i < trainees.length; i++){
			if (trainees[i] != null){
				sg = sg + trainees[i].getName() + ", ";
			} else {
				sg = sg + "null, ";
			}
		}
		return sg;
	}
	
	private static void stageAkcion(String msg, boolean print){
		if (print) {
			System.out.println("\n" + msg + "\n");
		}
	}
}