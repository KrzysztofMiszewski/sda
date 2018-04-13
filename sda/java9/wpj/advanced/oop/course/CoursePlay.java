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
        stageDirections("Czy udalo sie wejsc do sali? " + success);
        
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

        say("Manadżer " + manager.getFirstName(), manager.sayGreetings());
        say("Uczestnik " + firstTrainee.getName(), firstTrainee.sayGreetings());
        
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
        stageDirections("Sala, w której jest menedżer: " + manager.getRoom());
        
        /* 5. Uczestnik wchodzi do sali
         *
         * Hint:
         * Teraz kod, który mieliśmy w scenie 2 zwróci nam powodzenie
         * operacji, ponieważ sala jest już otwarta i uczestnik może do 
         * niej wejść.
         */
        success = firstTrainee.enter(ourRoom);
        stageDirections("Czy udalo sie wejsc do sali? " + success);
        stageDirections("Nasz uczestnik dla JVM wygląda tak: " + firstTrainee);
        stageDirections("A jakie obiekty uczestników mamy w sali? " 
                            + (java.util.Arrays.toString(ourRoom.getTrainees())));
        stageDirections("Nasz menedżer dla JVM wygląda tak: " + manager);
        stageDirections("A jaki obiekt menedżera mamy w sali? " 
                            + (ourRoom.getCourseManager()));
        
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
        stageDirections("Nasi uczestnicy oczami JVM: " + java.util.Arrays.toString(trainees));
        
        
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
        stageDirections("Jacy uczestnicy są w sali? " + java.util.Arrays.toString(ourRoom.getTrainees()));    
        
        /* 8. Uczestnicy przedstawiają się [do tej pory wszyscy stoją].
         *
         * Hint:
         * Również ten przypadek jest dla nas prosty. Wiemy jak uczestnik może się przedstawić.
         * Teraz, wykorzystując tablicę, poprosimy wszystkich uczestników, aby się przedstawili.
         * Również pierwszego, ponieważ teraz będzie się przedstawiał innym.
         */
        for (Trainee trainee : trainees) {
            say("Uczestnik " + trainee.getName(), trainee.sayGreetings());
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
        stageDirections("Jaki trener jest w pokoju? " + ourRoom.getTrainer());
        say("Trener", theTrainer.sayGreetings());
        
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

		pickSeat(trainees, ourRoom);
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
        say("Menedżer", manager.sayCourseInfo(sdaJava));
		
		// SCENA 2
		
		// 1 Trener ogłasza przerwę
		
		say(theTrainer.getName() + ": ", "Oglaszam przerwe!");
		
		// 2 Menedżer kursu opuszcza Salę i Kurs.
		
		manager.leave();
		stageDirections("Jaki manager jest w pokoju? " + ourRoom.getCourseManager());
		
		// 3 Uczestnicy wstają i wychodzą z Sali.
		
		for (int i = 0; i < trainees.length; i++){
			trainees[i].stand();
			ourRoom.removeTrainee(trainees[i]);
		}
		stageDirections("Jacy uczestnicy są w sali? " + java.util.Arrays.toString(ourRoom.getTrainees()));
		
		// 4 Od 2 do 6 uczestników idzie do Toalet. Uczestnicy mogą być różnych płci. Toalety nie są koedukacyjne.
		
		Toilet male = new Toilet('M', 4);
		Toilet female = new Toilet('D', 4);
		int traineesInToilet = 2 + (int) (5 * Math.random());
		stageDirections(traineesInToilet + " uczestnikow idzie do Toalety");
		goToilet(trainees, traineesInToilet, male, female);
		stageDirections("Uczestnik w toalecie meskiej: " + male.getOccupant());
		stageDirections("Kolejka do toalety meskiej: " + java.util.Arrays.toString(male.getLine()));
		stageDirections("Uczestnik w toalecie damskiej: " + female.getOccupant());
		stageDirections("Kolejka do toalety damskiej: " + java.util.Arrays.toString(female.getLine()));
		
		// 5 Pozostali Uczestnicy idą do kuchni. Każdy z Uczestników bierze w kuchni Kubek.
		
		for (int i = 0; i < trainees.length; i++){
			;
		}
		
		// 6 Część Uczestników robi kawę w Automacie do kawy, część nalewa sobie wodę w Automacie z wodą (proporcje 75% do 25%).
		// 7 Połowa z Uczestników, którzy byli w Toaletach przychodzi do kuchni zrobić sobie kawę.
		// 8 Wszyscy Uczestnicy wracają na Salę i zajmują te same miejsca, co wcześniej.

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
	
	private static void pickSeat(Trainee[] trainees, ClassRoom classRoom){
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
			say (trainees[i].getName(), ("Wybieram siedzenie " + trainees[i].getMyChair()));
		}
	}
	
    private static void stageDirections(String msg) {
        System.out.println("====> Didaskalia\n" + msg + "\n====");
    }
    
    private static void say(String who, String what) {
        System.out.println(who + ": \n" + "    \"" + what + "\"");
    }
}