package Test2.Car;// Bitte beantworten Sie die Multiple-Choice-Fragen (maximal 25 Punkte, 1 Punkt pro 'Choice').

public class MCTest2 {

    // Wenn 'answer' in 'new Choice(...)' für davor stehende 'question' zutrifft, 'valid' bitte auf 'true' ändern.
    // Sonst 'valid' auf 'false' belassen.
    // Kommentare wirken sich nicht auf die Beurteilung aus.
    // Bitte sonst nichts ändern. Zur Kontrolle MCTest2 ausführen.
    public static void main(String[] args) {
        checkAndPrint(

                new Question(
                        "i, j und k seien Objektreferenzen ungleich null.\n" +
                        "Welche der folgenden Bedingungen müssen für jede Implementierung der Methoden\n" +
                        "boolean equals(Object obj)  und  int hashCode()  in Java gelten?",

                        new Choice(true, "Aus  !j.equals(k)  folgt  !k.equals(j).                                            (1A)"),
                        new Choice(true, "Aus  i.equals(j)  und  j.equals(k)  folgt  i.equals(k).                            (1B)"),
                        new Choice(true, "Aus  j.equals(k)  folgt  j.hashCode() == k.hashCode().                             (1C)"),
                        new Choice(false, "j.hashCode() >= 0  gibt  true  zurück.                                             (1D)"),
                        new Choice(true, "Aus  !j.equals(k)  folgt  j.hashCode() != k.hashCode().                            (1E)")
                ),

                new Question(
                        "public int median(int[] o) { return o[o.length / 2]; } \n" +
                        "Welche der folgenden Aussagen können (jede für sich) als Vor- bzw. Nachbedingungen\n" +
                        "dieser Methode sinnvoll sein?",

                        new Choice(true, "Nachbedingung: Gibt o[0] zurück wenn o.length == 1.                                (2A)"),
                        new Choice(true, "Nachbedingung: Ergebnis hängt von einem Eintrag von o ab.                          (2B)"),
                        new Choice(false, "Nachbedingung: o ist absteigend sortiert.                                          (2C)"),
                        new Choice(false, "Vorbedingung: Wirft eine Exception wenn o == null.                                 (2D)"),
                        new Choice(true, "Nachbedingung: Gibt einen Eintrag etwa in der Mitte von o zurück.                  (2E)")
                ),

                new Question(
                        "Welche der folgenden Aussagen treffen auf das Testen großer Programme zu?",

                        new Choice(true, "White-Box-Testen leitet Testfälle aus der Implementierung ab.                      (3A)"),
                        new Choice(true, "Anwender können beim Auffinden von Fehlerursachen hilfreich sein.                  (3B)"),
                        new Choice(false, "Grey-Box-Testen legt Testfälle nach der Implementierung fest.                      (3C)"),
                        new Choice(false, "Black-Box-Testen legt Testfälle vor der Implementierung fest.                      (3D)"),
                        new Choice(false, "Regressions-Tests müssen fast immer händisch durchgeführt werden.                  (3E)")
                ),

                new Question(
                        "Welche der folgenden Aussagen treffen auf die Einhaltung von Zusicherungen\n" +
                        "entsprechend Design-by-Contract zu?",

                        new Choice(true, "Aufgerufene Methoden müssen für die Einhaltung von Vorbedingungen sorgen.          (4A)"),
                        new Choice(false, "Clients können sich auf die Einhaltung der Vorbedingungen verlassen.               (4B)"),
                        new Choice(false, "Clients müssen für die Einhaltung von Nachbedingungen sorgen.                      (4C)"),
                        new Choice(true, "Beim Beenden von Methoden müssen alle Invarianten erfüllt sein.                    (4D)"),
                        new Choice(true, "Aufrufer können sich auf die Einhaltung von Nachbedingungen verlassen.             (4E)")
                ),

                new Question(
                        "public int sumFrom1To(int q) { return (q * (q + 1)) / 2; } \n" +
                        "Welche der folgenden Aussagen können (jede für sich) als Vor- bzw. Nachbedingungen\n" +
                        "dieser Methode sinnvoll sein?",

                        new Choice(false, "Nachbedingung: Ergebnis ist für q <= 0 nicht die Zahlensumme.                      (5A)"),
                        new Choice(true, "Nachbedingung: Halbiert (q * (q + 1)).                                             (5B)"),
                        new Choice(true, "Vorbedingung: q >= 1.                                                              (5C)"),
                        new Choice(false, "Vorbedingung: Gibt (q * q + q) / 2 zurück.                                         (5D)"),
                        new Choice(false, "Vorbedingung: Ergebnis hängt nur von q ab.                                         (5E)")
                )
        );
    }

// Ende der Multiple-Choice-Fragen

//------------------------------------------------------------
// Bitte lassen Sie den Rest der Datei unverändert.
// Please do not edit below this line.

    private static final String EXPECT = // nochmals die gleichen Fragen zur Selbstkontrolle 
            " 1. i, j und k seien Objektreferenzen ungleich null.\n" +
            "    Welche der folgenden Bedingungen müssen für jede Implementierung der Methoden\n" +
            "    boolean equals(Object obj)  und  int hashCode()  in Java gelten?\n" +
            "    \n" +
            "    XXXXXXXXX Aus  !j.equals(k)  folgt  !k.equals(j).                                            (1A)\n" +
            "    XXXXXXXXX Aus  i.equals(j)  und  j.equals(k)  folgt  i.equals(k).                            (1B)\n" +
            "    XXXXXXXXX Aus  j.equals(k)  folgt  j.hashCode() == k.hashCode().                             (1C)\n" +
            "    XXXXXXXXX j.hashCode() >= 0  gibt  true  zurück.                                             (1D)\n" +
            "    XXXXXXXXX Aus  !j.equals(k)  folgt  j.hashCode() != k.hashCode().                            (1E)\n" +
            "\n" +
            " 2. public int median(int[] o) { return o[o.length / 2]; } \n" +
            "    Welche der folgenden Aussagen können (jede für sich) als Vor- bzw. Nachbedingungen\n" +
            "    dieser Methode sinnvoll sein?\n" +
            "    \n" +
            "    XXXXXXXXX Nachbedingung: Gibt o[0] zurück wenn o.length == 1.                                (2A)\n" +
            "    XXXXXXXXX Nachbedingung: Ergebnis hängt von einem Eintrag von o ab.                          (2B)\n" +
            "    XXXXXXXXX Nachbedingung: o ist absteigend sortiert.                                          (2C)\n" +
            "    XXXXXXXXX Vorbedingung: Wirft eine Exception wenn o == null.                                 (2D)\n" +
            "    XXXXXXXXX Nachbedingung: Gibt einen Eintrag etwa in der Mitte von o zurück.                  (2E)\n" +
            "\n" +
            " 3. Welche der folgenden Aussagen treffen auf das Testen großer Programme zu?\n" +
            "    \n" +
            "    XXXXXXXXX White-Box-Testen leitet Testfälle aus der Implementierung ab.                      (3A)\n" +
            "    XXXXXXXXX Anwender können beim Auffinden von Fehlerursachen hilfreich sein.                  (3B)\n" +
            "    XXXXXXXXX Grey-Box-Testen legt Testfälle nach der Implementierung fest.                      (3C)\n" +
            "    XXXXXXXXX Black-Box-Testen legt Testfälle vor der Implementierung fest.                      (3D)\n" +
            "    XXXXXXXXX Regressions-Tests müssen fast immer händisch durchgeführt werden.                  (3E)\n" +
            "\n" +
            " 4. Welche der folgenden Aussagen treffen auf die Einhaltung von Zusicherungen\n" +
            "    entsprechend Design-by-Contract zu?\n" +
            "    \n" +
            "    XXXXXXXXX Aufgerufene Methoden müssen für die Einhaltung von Vorbedingungen sorgen.          (4A)\n" +
            "    XXXXXXXXX Clients können sich auf die Einhaltung der Vorbedingungen verlassen.               (4B)\n" +
            "    XXXXXXXXX Clients müssen für die Einhaltung von Nachbedingungen sorgen.                      (4C)\n" +
            "    XXXXXXXXX Beim Beenden von Methoden müssen alle Invarianten erfüllt sein.                    (4D)\n" +
            "    XXXXXXXXX Aufrufer können sich auf die Einhaltung von Nachbedingungen verlassen.             (4E)\n" +
            "\n" +
            " 5. public int sumFrom1To(int q) { return (q * (q + 1)) / 2; } \n" +
            "    Welche der folgenden Aussagen können (jede für sich) als Vor- bzw. Nachbedingungen\n" +
            "    dieser Methode sinnvoll sein?\n" +
            "    \n" +
            "    XXXXXXXXX Nachbedingung: Ergebnis ist für q <= 0 nicht die Zahlensumme.                      (5A)\n" +
            "    XXXXXXXXX Nachbedingung: Halbiert (q * (q + 1)).                                             (5B)\n" +
            "    XXXXXXXXX Vorbedingung: q >= 1.                                                              (5C)\n" +
            "    XXXXXXXXX Vorbedingung: Gibt (q * q + q) / 2 zurück.                                         (5D)\n" +
            "    XXXXXXXXX Vorbedingung: Ergebnis hängt nur von q ab.                                         (5E)\n" +
            "\n";

    public static final long UID = 243559905842180L;

    private static void checkAndPrint(Question... questions) {
        int i = 1;
        String s = "";
        for (Question question : questions) {
            java.util.Scanner scanner = new java.util.Scanner(question.toString());
            s += String.format("%2d. %s\n", i++, scanner.nextLine());
            while (scanner.hasNextLine()) {
                s += String.format("    %s\n", scanner.nextLine());
            }
            s += "\n";
        }
        String converted = s.replace("Richtig: ", "XXXXXXXXX").replace("Falsch:  ", "XXXXXXXXX");
        if (!converted.replaceAll("[ \t]+", " ").equals(EXPECT.replaceAll("[ \t]+", " "))) {
            i = 0;
            String err = "\n";
            java.util.Scanner e = new java.util.Scanner(EXPECT);
            java.util.Scanner f = new java.util.Scanner(converted);
            while (e.hasNextLine() && f.hasNextLine() && i < 5) {
                String el = e.nextLine(), fl = f.nextLine();
                if (!el.replaceAll("[ \t]+", " ").equals(fl.replaceAll("[ \t]+", " "))) {
                    i++;
                    err += "Statt der Zeile: " + fl + "\nsollte stehen:   " + el + "\n\n";
                }
            }
            if (i >= 5) {
                err = "Das sind die erwarteten Fragen und Antwortmöglichkeiten in 'EXPECT':\n\n" + EXPECT;
            }
            System.out.println("ACHTUNG: Sie haben Programmteile verändert, die nicht geändert werden sollten.\n" +
                    "Beurteilt wird so, als ob diese Programmteile unverändert geblieben wären.\n" +
                    err);
            System.exit(1);
        }
        System.out.print("Die Multiple-Choice-Fragen wurden folgendermaßen beantwortet\n" +
                "(das sind nur Ihre Antworten, keine Aussage über Korrektheit):\n\n" +
                s);
        System.exit(0);
    }

    private static class Question {
        private final String question;
        private final Choice[] choices;

        public Question(String question, Choice... choices) {
            this.question = question;
            this.choices = choices;
        }

        public String toString() {
            String s = question + "\n\n";
            for (Choice choice : choices) {
                s += choice + "\n";
            }
            return s;
        }
    }

    private static class Choice {
        private final String answer;
        private final boolean valid;

        public Choice(boolean valid, String answer) {
            this.answer = answer;
            this.valid = valid;
        }

        public String toString() {
            return (valid ? "Richtig:  " : "Falsch:   ") + answer;
        }
    }
}