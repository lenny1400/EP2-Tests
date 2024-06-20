// Bitte beantworten Sie die Multiple-Choice-Fragen (maximal 25 Punkte, 1 Punkt pro 'Choice').

public class MCTest1 {

    // Wenn 'answer' in 'new Choice(...)' für davor stehende 'question' zutrifft, 'valid' bitte auf 'true' ändern.
    // Sonst 'valid' auf 'false' belassen.
    // Kommentare wirken sich nicht auf die Beurteilung aus.
    // Bitte sonst nichts ändern. Zur Kontrolle MCTest1 ausführen.
    public static void main(String[] args) {
        checkAndPrint(

                new Question(
                        "W sei ein Referenztyp (Klasse oder Interface), und y sei eine durch\n" +
                        "'M y = new H();' deklarierte Variable, wobei der Compiler keinen Fehler meldet.\n" +
                        "Welche der folgenden Aussagen treffen für alle passenden W, M, H und y zu?",

                        new Choice(true, "Mit 'H ist Untertyp von W' gilt: '((W)y).getClass() == W.class'               (1A)"),
                        new Choice(true, "'(W)null' liefert zur Laufzeit keinen Fehler.                                 (1B)"),
                        new Choice(true, "'(W)y' liefert Laufzeitfehler wenn H nicht Untertyp von W ist.                (1C)"),
                        new Choice(true, "M ist Obertyp von H.                                                          (1D)"),
                        new Choice(true, "'(W)y' liefert keinen Laufzeitfehler wenn M Untertyp von W ist.               (1E)")
                ),

                new Question(
                        "v sei eine Variable mit einer leeren assoziativen Datenstruktur, wobei Schlüssel\n" +
                        "und Werte vom Typ 'String' sind (und 'null' sein können).  R und D seien zwei\n" +
                        "voneinander verschiedene String-Konstanten (static final).  Nach welchen der\n" +
                        "folgenden Aufruf-Sequenzen liefert 'v.get(R)' den String in D als Ergebnis?",

                        new Choice(true, "v.put(D, R); v.put(R, D); v.put(v.get(D), v.get(R));                          (2A)"),
                        new Choice(true, "v.put(D, R); v.put(v.get(D), v.get(R)); v.put(R, D);                          (2B)"),
                        new Choice(true, "v.put(R, D); v.put(v.get(D), v.get(R)); v.put(D, R);                          (2C)"),
                        new Choice(false, "v.put(R, R); v.put(D, D); v.put(v.get(D), v.get(R));                          (2D)"),
                        new Choice(false, "v.put(v.get(R), v.get(D)); v.put(R, R); v.put(D, D);                          (2E)")
                ),

                new Question(
                        "Welche der folgenden Aussagen stimmen in Bezug auf die Unterscheidung zwischen\n" +
                        "Datenstrukturen und abstrakten Datentypen?",

                        new Choice(false, "Datenstrukturen legen meist keine Maximalgröße fest.                          (3A)"),
                        new Choice(false, "Datenstrukturen lassen offen, wie Operationen auf Daten zugreifen.            (3B)"),
                        new Choice(false, "Abstrakte Datentypen müssen bestimmte Datenstrukturen festlegen.              (3C)"),
                        new Choice(true, "Datenstrukturen lassen die Typen ihrer Einträge offen.                        (3D)"),
                        new Choice(true, "Abstrakte Datentypen beschreiben vorwiegend Datenstrukturen.                  (3E)")
                ),

                new Question(
                        "Welche der folgenden Aussagen stimmen in Bezug auf rekursive Datenstrukturen?",

                        new Choice(false, "Dereferenzieren ist das Entfernen von Referenzen aus dem Programm.            (4A)"),
                        new Choice(true, "Doppelt verkettete Listen sind in beide Richtungen traversierbar.             (4B)"),
                        new Choice(false, "Jeder Knoten, der mehrere Knoten referenziert, ist Teil eines Baums.          (4C)"),
                        new Choice(true, "Auch zyklische Datenstrukturen müssen fundiert sein.                          (4D)"),
                        new Choice(false, "Schleifen erlauben kein vollständiges Traversieren.                           (4E)")
                ),

                new Question(
                        "p sei eine Variable mit einem einfachen binären Suchbaum (nicht AVL-Baum)\n" +
                        "ganzer Zahlen, der durch diese Anweisungen aufgebaut wurde:\n" +
                        "    STree p = new STree(); p.add(4); p.add(3); p.add(8);\n" +
                        "Welche der folgenden Aussagen treffen auf p zu?",

                        new Choice(true, "Der Knoten mit Wert 4 ist Elter von dem mit Wert 3.                           (5A)"),
                        new Choice(false, "Der Knoten mit Wert 4 ist Kind von dem mit Wert 3.                            (5B)"),
                        new Choice(false, "Der Knoten mit Wert 8 ist die Wurzel.                                         (5C)"),
                        new Choice(true, "Der Baum ist perfekt ausbalanciert.                                           (5D)"),
                        new Choice(false, "Der Knoten mit Wert 4 ist ein Blattknoten.                                    (5E)")
                )
        );
    }

// Ende der Multiple-Choice-Fragen

//------------------------------------------------------------
// Bitte lassen Sie den Rest der Datei unverändert.
// Please do not edit below this line.

    private static final String EXPECT = // nochmals die gleichen Fragen zur Selbstkontrolle 
            " 1. W sei ein Referenztyp (Klasse oder Interface), und y sei eine durch\n" +
            "    'M y = new H();' deklarierte Variable, wobei der Compiler keinen Fehler meldet.\n" +
            "    Welche der folgenden Aussagen treffen für alle passenden W, M, H und y zu?\n" +
            "    \n" +
            "    XXXXXXXXX Mit 'H ist Untertyp von W' gilt: '((W)y).getClass() == W.class'               (1A)\n" +
            "    XXXXXXXXX '(W)null' liefert zur Laufzeit keinen Fehler.                                 (1B)\n" +
            "    XXXXXXXXX '(W)y' liefert Laufzeitfehler wenn H nicht Untertyp von W ist.                (1C)\n" +
            "    XXXXXXXXX M ist Obertyp von H.                                                          (1D)\n" +
            "    XXXXXXXXX '(W)y' liefert keinen Laufzeitfehler wenn M Untertyp von W ist.               (1E)\n" +
            "\n" +
            " 2. v sei eine Variable mit einer leeren assoziativen Datenstruktur, wobei Schlüssel\n" +
            "    und Werte vom Typ 'String' sind (und 'null' sein können).  R und D seien zwei\n" +
            "    voneinander verschiedene String-Konstanten (static final).  Nach welchen der\n" +
            "    folgenden Aufruf-Sequenzen liefert 'v.get(R)' den String in D als Ergebnis?\n" +
            "    \n" +
            "    XXXXXXXXX v.put(D, R); v.put(R, D); v.put(v.get(D), v.get(R));                          (2A)\n" +
            "    XXXXXXXXX v.put(D, R); v.put(v.get(D), v.get(R)); v.put(R, D);                          (2B)\n" +
            "    XXXXXXXXX v.put(R, D); v.put(v.get(D), v.get(R)); v.put(D, R);                          (2C)\n" +
            "    XXXXXXXXX v.put(R, R); v.put(D, D); v.put(v.get(D), v.get(R));                          (2D)\n" +
            "    XXXXXXXXX v.put(v.get(R), v.get(D)); v.put(R, R); v.put(D, D);                          (2E)\n" +
            "\n" +
            " 3. Welche der folgenden Aussagen stimmen in Bezug auf die Unterscheidung zwischen\n" +
            "    Datenstrukturen und abstrakten Datentypen?\n" +
            "    \n" +
            "    XXXXXXXXX Datenstrukturen legen meist keine Maximalgröße fest.                          (3A)\n" +
            "    XXXXXXXXX Datenstrukturen lassen offen, wie Operationen auf Daten zugreifen.            (3B)\n" +
            "    XXXXXXXXX Abstrakte Datentypen müssen bestimmte Datenstrukturen festlegen.              (3C)\n" +
            "    XXXXXXXXX Datenstrukturen lassen die Typen ihrer Einträge offen.                        (3D)\n" +
            "    XXXXXXXXX Abstrakte Datentypen beschreiben vorwiegend Datenstrukturen.                  (3E)\n" +
            "\n" +
            " 4. Welche der folgenden Aussagen stimmen in Bezug auf rekursive Datenstrukturen?\n" +
            "    \n" +
            "    XXXXXXXXX Dereferenzieren ist das Entfernen von Referenzen aus dem Programm.            (4A)\n" +
            "    XXXXXXXXX Doppelt verkettete Listen sind in beide Richtungen traversierbar.             (4B)\n" +
            "    XXXXXXXXX Jeder Knoten, der mehrere Knoten referenziert, ist Teil eines Baums.          (4C)\n" +
            "    XXXXXXXXX Auch zyklische Datenstrukturen müssen fundiert sein.                          (4D)\n" +
            "    XXXXXXXXX Schleifen erlauben kein vollständiges Traversieren.                           (4E)\n" +
            "\n" +
            " 5. p sei eine Variable mit einem einfachen binären Suchbaum (nicht AVL-Baum)\n" +
            "    ganzer Zahlen, der durch diese Anweisungen aufgebaut wurde:\n" +
            "        STree p = new STree(); p.add(4); p.add(3); p.add(8);\n" +
            "    Welche der folgenden Aussagen treffen auf p zu?\n" +
            "    \n" +
            "    XXXXXXXXX Der Knoten mit Wert 4 ist Elter von dem mit Wert 3.                           (5A)\n" +
            "    XXXXXXXXX Der Knoten mit Wert 4 ist Kind von dem mit Wert 3.                            (5B)\n" +
            "    XXXXXXXXX Der Knoten mit Wert 8 ist die Wurzel.                                         (5C)\n" +
            "    XXXXXXXXX Der Baum ist perfekt ausbalanciert.                                           (5D)\n" +
            "    XXXXXXXXX Der Knoten mit Wert 4 ist ein Blattknoten.                                    (5E)\n" +
            "\n";

    public static final long UID = 249389336026410L;

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