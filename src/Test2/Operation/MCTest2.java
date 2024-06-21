package Test2.Operation;// Bitte beantworten Sie die Multiple-Choice-Fragen (maximal 25 Punkte, 1 Punkt pro 'Choice').

public class MCTest2 {

    // Wenn 'answer' in 'new Choice(...)' für davor stehende 'question' zutrifft, 'valid' bitte auf 'true' ändern.
    // Sonst 'valid' auf 'false' belassen.
    // Kommentare wirken sich nicht auf die Beurteilung aus.
    // Bitte sonst nichts ändern. Zur Kontrolle MCTest2 ausführen.
    public static void main(String[] args) {
        checkAndPrint(
            // bitte lieb bewerten :(
                new Question(
                        "int b=29, w=1, j=1; while (j < b) w *= ++j; \n" +
                        "Welche der folgenden Aussagen sind gültige Schleifeninvarianten dieser Schleife?",

                        new Choice(true, "b == 29                                                                            (1A)"),
                        new Choice(true, "j >= 1 && j <= b                                                                   (1B)"),
                        new Choice(false, "j > 1                                                                              (1C)"),
                        new Choice(true, "w ist das Produkt aller Zahlen von 1 bis j, also 1*...*j                           (1D)"),
                        new Choice(false, "w ist das Produkt aller Zahlen von 1 bis b, also 1*...*b                           (1E)")
                ),

                new Question(
                        "Welche der folgenden Aussagen treffen in Bezug auf Algorithmen und Datenstrukturen zu?",

                        new Choice(false, "Quicksort eignet sich besser für lineare Listen als für Arrays.                    (2A)"),
                        new Choice(true, "Bäume verwenden wir meist nur wo andere Datenstrukturen nicht passen.              (2B)"),
                        new Choice(true, "Absicherung gegen schlechte Datenverteilung kann die Laufzeit erhöhen.             (2C)"),
                        new Choice(false, "Hash-Tabellen werden wegen ihrer Zufallsabhängigkeit kaum verwendet.               (2D)"),
                        new Choice(false, "Hash-Tabellen eignen sich vor allem gut für geordnete Daten.                       (2E)")
                ),

                new Question(
                        "public int sumFrom1To(int z) { return (z * (z + 1)) / 2; } \n" +
                        "Welche der folgenden Aussagen können (jede für sich) als Vor- bzw. Nachbedingungen\n" +
                        "dieser Methode sinnvoll sein?",

                        new Choice(false, "Vorbedingung: Ergebnis ist für z < 1 nicht die Zahlensumme.                        (3A)"),
                        new Choice(true, "Nachbedingung: Gibt (z * (z + 1)) / 2 zurück.                                      (3B)"),
                        new Choice(true, "Nachbedingung: Halbiert (z * (z + 1)).                                             (3C)"),
                        new Choice(false, "Nachbedingung: Ergebnis hängt nur von z ab.                                        (3D)"),
                        new Choice(true, "Vorbedingung: z >= 1.                                                              (3E)")
                ),

                new Question(
                        "Welche der folgenden Aussagen treffen auf gut gewählte Kommentare in Programmen zu?",

                        new Choice(true, "Alle Kommentare sind Zusicherungen entsprechend Design-by-Contract.                (4A)"),
                        new Choice(true, "Kommentare sollen vor allem die Innensicht darstellen.                             (4B)"),
                        new Choice(false, "Besonders gute Programmstellen brauchen nicht viele Kommentare.                    (4C)"),
                        new Choice(false, "Schleifeninvarianten stehen hauptsächlich bei Variablendeklarationen.              (4D)"),
                        new Choice(true, "Nachbedingungen stehen hauptsächlich vor Methodenköpfen.                           (4E)")
                ),

                new Question(
                        "Welche der folgenden Aussagen treffen auf die Einhaltung von Zusicherungen\n" +
                        "entsprechend Design-by-Contract zu?",

                        new Choice(false, "Aufrufer müssen für die Einhaltung von Nachbedingungen sorgen.                     (5A)"),
                        new Choice(false, "Clients können sich auf die Einhaltung der Vorbedingungen verlassen.               (5B)"),
                        new Choice(true, "Clients können sich auf die Einhaltung von Nachbedingungen verlassen.              (5C)"),
                        new Choice(true, "Server müssen für die Einhaltung von Vorbedingungen sorgen.                        (5D)"),
                        new Choice(false, "Clients müssen für die Einhaltung ihrer Invarianten sorgen.                        (5E)")
                )
        );
    }

// Ende der Multiple-Choice-Fragen

//------------------------------------------------------------
// Bitte lassen Sie den Rest der Datei unverändert.
// Please do not edit below this line.

    private static final String EXPECT = // nochmals die gleichen Fragen zur Selbstkontrolle 
            " 1. int b=29, w=1, j=1; while (j < b) w *= ++j; \n" +
            "    Welche der folgenden Aussagen sind gültige Schleifeninvarianten dieser Schleife?\n" +
            "    \n" +
            "    XXXXXXXXX b == 29                                                                            (1A)\n" +
            "    XXXXXXXXX j >= 1 && j <= b                                                                   (1B)\n" +
            "    XXXXXXXXX j > 1                                                                              (1C)\n" +
            "    XXXXXXXXX w ist das Produkt aller Zahlen von 1 bis j, also 1*...*j                           (1D)\n" +
            "    XXXXXXXXX w ist das Produkt aller Zahlen von 1 bis b, also 1*...*b                           (1E)\n" +
            "\n" +
            " 2. Welche der folgenden Aussagen treffen in Bezug auf Algorithmen und Datenstrukturen zu?\n" +
            "    \n" +
            "    XXXXXXXXX Quicksort eignet sich besser für lineare Listen als für Arrays.                    (2A)\n" +
            "    XXXXXXXXX Bäume verwenden wir meist nur wo andere Datenstrukturen nicht passen.              (2B)\n" +
            "    XXXXXXXXX Absicherung gegen schlechte Datenverteilung kann die Laufzeit erhöhen.             (2C)\n" +
            "    XXXXXXXXX Hash-Tabellen werden wegen ihrer Zufallsabhängigkeit kaum verwendet.               (2D)\n" +
            "    XXXXXXXXX Hash-Tabellen eignen sich vor allem gut für geordnete Daten.                       (2E)\n" +
            "\n" +
            " 3. public int sumFrom1To(int z) { return (z * (z + 1)) / 2; } \n" +
            "    Welche der folgenden Aussagen können (jede für sich) als Vor- bzw. Nachbedingungen\n" +
            "    dieser Methode sinnvoll sein?\n" +
            "    \n" +
            "    XXXXXXXXX Vorbedingung: Ergebnis ist für z < 1 nicht die Zahlensumme.                        (3A)\n" +
            "    XXXXXXXXX Nachbedingung: Gibt (z * (z + 1)) / 2 zurück.                                      (3B)\n" +
            "    XXXXXXXXX Nachbedingung: Halbiert (z * (z + 1)).                                             (3C)\n" +
            "    XXXXXXXXX Nachbedingung: Ergebnis hängt nur von z ab.                                        (3D)\n" +
            "    XXXXXXXXX Vorbedingung: z >= 1.                                                              (3E)\n" +
            "\n" +
            " 4. Welche der folgenden Aussagen treffen auf gut gewählte Kommentare in Programmen zu?\n" +
            "    \n" +
            "    XXXXXXXXX Alle Kommentare sind Zusicherungen entsprechend Design-by-Contract.                (4A)\n" +
            "    XXXXXXXXX Kommentare sollen vor allem die Innensicht darstellen.                             (4B)\n" +
            "    XXXXXXXXX Besonders gute Programmstellen brauchen nicht viele Kommentare.                    (4C)\n" +
            "    XXXXXXXXX Schleifeninvarianten stehen hauptsächlich bei Variablendeklarationen.              (4D)\n" +
            "    XXXXXXXXX Nachbedingungen stehen hauptsächlich vor Methodenköpfen.                           (4E)\n" +
            "\n" +
            " 5. Welche der folgenden Aussagen treffen auf die Einhaltung von Zusicherungen\n" +
            "    entsprechend Design-by-Contract zu?\n" +
            "    \n" +
            "    XXXXXXXXX Aufrufer müssen für die Einhaltung von Nachbedingungen sorgen.                     (5A)\n" +
            "    XXXXXXXXX Clients können sich auf die Einhaltung der Vorbedingungen verlassen.               (5B)\n" +
            "    XXXXXXXXX Clients können sich auf die Einhaltung von Nachbedingungen verlassen.              (5C)\n" +
            "    XXXXXXXXX Server müssen für die Einhaltung von Vorbedingungen sorgen.                        (5D)\n" +
            "    XXXXXXXXX Clients müssen für die Einhaltung ihrer Invarianten sorgen.                        (5E)\n" +
            "\n";

    public static final long UID = 243555090270180L;

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