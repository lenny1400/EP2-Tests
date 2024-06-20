package Test1.BlockQueue;// Bitte beantworten Sie die Multiple-Choice-Fragen (maximal 25 Punkte, 1 Punkt pro 'Choice').

public class MCTest1 {

    // Wenn 'answer' in 'new Choice(...)' für davor stehende 'question' zutrifft, 'valid' bitte auf 'true' ändern.
    // Sonst 'valid' auf 'false' belassen.
    // Kommentare wirken sich nicht auf die Beurteilung aus.
    // Bitte sonst nichts ändern. Zur Kontrolle MCTest1 ausführen.
    public static void main(String[] args) {
        checkAndPrint(

                new Question(
                        "y sei eine Variable mit einer leeren assoziativen Datenstruktur, wobei Schlüssel\n" +
                        "und Werte vom Typ 'String' sind (und 'null' sein können).  H und X seien zwei\n" +
                        "voneinander verschiedene String-Konstanten (static final).  Nach welchen der\n" +
                        "folgenden Aufruf-Sequenzen liefert 'y.get(H)' den String in X als Ergebnis?",

                        new Choice(false, "y.put(y.get(H), y.get(X)); y.put(H, H); y.put(X, X);                          (1A)"),
                        new Choice(true, "y.put(H, X); y.put(y.get(X), y.get(H)); y.put(X, H);                          (1B)"),
                        new Choice(true, "y.put(X, H); y.put(H, X); y.put(y.get(X), y.get(H));                          (1C)"),
                        new Choice(false, "y.put(H, X); y.put(H, H); y.put(X, H);                                        (1D)"),
                        new Choice(false, "y.put(H, X); y.put(H, H); y.put(y.get(H), y.get(X));                          (1E)")
                ),

                new Question(
                        "Welche der folgenden Aussagen stimmen in Bezug auf dynamisches und statisches Binden?",

                        new Choice(true, "Klassenmethoden werden immer statisch gebunden.                               (2A)"),
                        new Choice(false, "Dynamisches Binden ist zusammen mit Untertypbeziehungen sinnvoll.             (2B)"),
                        new Choice(false, "Ein dynamischer Typ ist stets ein Interface, keine Klasse.                    (2C)"),
                        new Choice(true, "'final' Methoden werden immer statisch gebunden.                              (2D)"),
                        new Choice(true, "Objektmethoden werden im dynamischen Typ des Objekts ausgeführt.              (2E)")
                ),

                new Question(
                        "Y sei ein Referenztyp (Klasse oder Interface), und\n" +
                        "i sei eine Variable eines Referenztyps mit 'i != null'.\n" +
                        "Welche der folgenden Aussagen treffen für alle Y und i zu?",

                        new Choice(false, "Liefert '(Y)i' keinen Laufzeitfehler, dann gilt '!(i instanceof Y)'.          (3A)"),
                        new Choice(false, "'i.getClass()' liefert ein Objekt vom Typ 'String'.                           (3B)"),
                        new Choice(false, "Gilt 'i instanceof Y', dann ist Y ein Interface.                              (3C)"),
                        new Choice(false, "Aus 'i.getClass() == Y.class' folgt: 'Y ist ein Interface'.                   (3D)"),
                        new Choice(true, "Aus 'i instanceof Y' folgt: 'i.getClass() == Y.class'.                        (3E)")
                ),

                new Question(
                        "y sei eine Variable mit einem einfachen binären Suchbaum (nicht AVL-Baum)\n" +
                        "ganzer Zahlen, der durch diese Anweisungen aufgebaut wurde:\n" +
                        "    STree y = new STree(); y.add(2); y.add(1); y.add(4);\n" +
                        "Welche der folgenden Aussagen treffen auf y zu?",

                        new Choice(true, "Der Knoten mit Wert 4 ist Kind von dem mit Wert 2.                            (4A)"),
                        new Choice(true, "Der Knoten mit Wert 2 ist die Wurzel.                                         (4B)"),
                        new Choice(true, "Der Baum hat minimale Tiefe für einen Baum mit 3 Knoten.                      (4C)"),
                        new Choice(true, "Der Knoten mit Wert 2 ist Elter von dem mit Wert 4.                           (4D)"),
                        new Choice(true, "Der Knoten mit Wert 4 ist ein Blattknoten.                                    (4E)")
                ),

                new Question(
                        "D, I und A seien beliebige Referenztypen. Welche der folgenden Aussagen treffen zu?",

                        new Choice(true, "A ist Untertyp von A.                                                         (5A)"),
                        new Choice(true, "'null' ist nicht Objekt von irgendeinem Referenztyp A.                        (5B)"),
                        new Choice(false, "Aus 'A ist Klasse' und 'I ist Interface' folgt: 'I ist kein Untertyp von A'.  (5C)"),
                        new Choice(true, "Aus 'D Untertyp von I' und 'I Untertyp von D' folgt: 'D.class==I.class'.      (5D)"),
                        new Choice(false, "Aus 'I Untertyp von A' folgt: 'für jede Methode in I existiert Methode in A'. (5E)")
                )
        );
    }

// Ende der Multiple-Choice-Fragen

//------------------------------------------------------------
// Bitte lassen Sie den Rest der Datei unverändert.
// Please do not edit below this line.

    private static final String EXPECT = // nochmals die gleichen Fragen zur Selbstkontrolle 
            " 1. y sei eine Variable mit einer leeren assoziativen Datenstruktur, wobei Schlüssel\n" +
            "    und Werte vom Typ 'String' sind (und 'null' sein können).  H und X seien zwei\n" +
            "    voneinander verschiedene String-Konstanten (static final).  Nach welchen der\n" +
            "    folgenden Aufruf-Sequenzen liefert 'y.get(H)' den String in X als Ergebnis?\n" +
            "    \n" +
            "    XXXXXXXXX y.put(y.get(H), y.get(X)); y.put(H, H); y.put(X, X);                          (1A)\n" +
            "    XXXXXXXXX y.put(H, X); y.put(y.get(X), y.get(H)); y.put(X, H);                          (1B)\n" +
            "    XXXXXXXXX y.put(X, H); y.put(H, X); y.put(y.get(X), y.get(H));                          (1C)\n" +
            "    XXXXXXXXX y.put(H, X); y.put(H, H); y.put(X, H);                                        (1D)\n" +
            "    XXXXXXXXX y.put(H, X); y.put(H, H); y.put(y.get(H), y.get(X));                          (1E)\n" +
            "\n" +
            " 2. Welche der folgenden Aussagen stimmen in Bezug auf dynamisches und statisches Binden?\n" +
            "    \n" +
            "    XXXXXXXXX Klassenmethoden werden immer statisch gebunden.                               (2A)\n" +
            "    XXXXXXXXX Dynamisches Binden ist zusammen mit Untertypbeziehungen sinnvoll.             (2B)\n" +
            "    XXXXXXXXX Ein dynamischer Typ ist stets ein Interface, keine Klasse.                    (2C)\n" +
            "    XXXXXXXXX 'final' Methoden werden immer statisch gebunden.                              (2D)\n" +
            "    XXXXXXXXX Objektmethoden werden im dynamischen Typ des Objekts ausgeführt.              (2E)\n" +
            "\n" +
            " 3. Y sei ein Referenztyp (Klasse oder Interface), und\n" +
            "    i sei eine Variable eines Referenztyps mit 'i != null'.\n" +
            "    Welche der folgenden Aussagen treffen für alle Y und i zu?\n" +
            "    \n" +
            "    XXXXXXXXX Liefert '(Y)i' keinen Laufzeitfehler, dann gilt '!(i instanceof Y)'.          (3A)\n" +
            "    XXXXXXXXX 'i.getClass()' liefert ein Objekt vom Typ 'String'.                           (3B)\n" +
            "    XXXXXXXXX Gilt 'i instanceof Y', dann ist Y ein Interface.                              (3C)\n" +
            "    XXXXXXXXX Aus 'i.getClass() == Y.class' folgt: 'Y ist ein Interface'.                   (3D)\n" +
            "    XXXXXXXXX Aus 'i instanceof Y' folgt: 'i.getClass() == Y.class'.                        (3E)\n" +
            "\n" +
            " 4. y sei eine Variable mit einem einfachen binären Suchbaum (nicht AVL-Baum)\n" +
            "    ganzer Zahlen, der durch diese Anweisungen aufgebaut wurde:\n" +
            "        STree y = new STree(); y.add(2); y.add(1); y.add(4);\n" +
            "    Welche der folgenden Aussagen treffen auf y zu?\n" +
            "    \n" +
            "    XXXXXXXXX Der Knoten mit Wert 4 ist Kind von dem mit Wert 2.                            (4A)\n" +
            "    XXXXXXXXX Der Knoten mit Wert 2 ist die Wurzel.                                         (4B)\n" +
            "    XXXXXXXXX Der Baum hat minimale Tiefe für einen Baum mit 3 Knoten.                      (4C)\n" +
            "    XXXXXXXXX Der Knoten mit Wert 2 ist Elter von dem mit Wert 4.                           (4D)\n" +
            "    XXXXXXXXX Der Knoten mit Wert 4 ist ein Blattknoten.                                    (4E)\n" +
            "\n" +
            " 5. D, I und A seien beliebige Referenztypen. Welche der folgenden Aussagen treffen zu?\n" +
            "    \n" +
            "    XXXXXXXXX A ist Untertyp von A.                                                         (5A)\n" +
            "    XXXXXXXXX 'null' ist nicht Objekt von irgendeinem Referenztyp A.                        (5B)\n" +
            "    XXXXXXXXX Aus 'A ist Klasse' und 'I ist Interface' folgt: 'I ist kein Untertyp von A'.  (5C)\n" +
            "    XXXXXXXXX Aus 'D Untertyp von I' und 'I Untertyp von D' folgt: 'D.class==I.class'.      (5D)\n" +
            "    XXXXXXXXX Aus 'I Untertyp von A' folgt: 'für jede Methode in I existiert Methode in A'. (5E)\n" +
            "\n";

    public static final long UID = 249440483807815L;

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