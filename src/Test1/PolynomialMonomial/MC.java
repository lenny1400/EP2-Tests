package Test1.PolynomialMonomial;

// Bitte beantworten Sie die Multiple-Choice-Fragen (maximal 25 Punkte, 1 Punkt pro 'Choice').

public class MC {

    // Wenn 'answer' in 'new Choice(...)' für davor stehende 'question' zutrifft, 'valid' bitte auf 'true' ändern.
    // Sonst 'valid' auf 'false' belassen.
    // Kommentare wirken sich nicht auf die Beurteilung aus.
    // Bitte sonst nichts ändern. Zur Kontrolle MCTest1 ausführen.
    public static void main(String[] args) {
        checkAndPrint(
                new Question(
                        "Welche der folgenden Aussagen gelten in Java für die unterschiedlichen\n" +
                                "Arten von Variablen und Parametern?",

                        new Choice(false, "Lokale Variablen werden meist als 'private' deklariert.                       (1A)"),
                        new Choice(true, "Formale Parameter können Klassenvariablen verdecken.                          (1B)"),
                        new Choice(false, "Klassenvariablen werden ohne 'static' deklariert.                             (1C)"),
                        new Choice(false, "Parameter und lokale Variablen dürfen nicht gleich heißen.                    (1D)"),
                        new Choice(true, "Objektvariablen werden bei Erzeugung des Objekts angelegt.                    (1E)")
                ),

                new Question(
                        "i sei eine Variable mit einer leeren assoziativen Datenstruktur, wobei Schlüssel\n" +
                                "und Werte vom Typ 'String' sind (und 'null' sein können).  G und D seien zwei\n" +
                                "voneinander verschiedene String-Konstanten (static final).  Nach welchen der\n" +
                                "folgenden Aufruf-Sequenzen liefert 'i.get(G)' den String in D als Ergebnis?",

                        new Choice(true, "i.put(G, D); i.put(i.get(D), i.get(G)); i.put(D, G);                          (2A)"),
                        new Choice(false, "i.put(G, G); i.put(i.get(G), i.get(D)); i.put(D, D);                          (2B)"),
                        new Choice(false, "i.put(G, D); i.put(G, G); i.put(i.get(G), i.get(D));                          (2C)"),
                        new Choice(false, "i.put(G, G); i.put(D, D); i.put(i.get(D), i.get(G));                          (2D)"),
                        new Choice(false, "i.put(G, D); i.put(G, G); i.put(D, G);                                        (2E)")
                ),

                new Question(
                        "r sei eine Variable mit einem einfachen binären Suchbaum (nicht AVL-Baum)\n" +
                                "ganzer Zahlen, der durch diese Anweisungen aufgebaut wurde:\n" +
                                "    STree r = new STree(); r.add(7); r.add(1); r.add(8);\n" +
                                "Welche der folgenden Aussagen treffen auf r zu?",

                        new Choice(false, "Der Knoten mit Wert 8 ist Elter von dem mit Wert 7.                           (3A)"),
                        new Choice(false, "Der Knoten mit Wert 7 ist Kind von dem mit Wert 1.                            (3B)"),
                        new Choice(true, "Der Knoten mit Wert 8 ist ein Blattknoten.                                    (3C)"),
                        new Choice(false, "Der Knoten mit Wert 8 ist die Wurzel.                                         (3D)"),
                        new Choice(true, "Der Baum hat minimale Tiefe für einen Baum mit 3 Knoten.                      (3E)")
                ),

                new Question(
                        "F sei ein Referenztyp (Klasse oder Interface), und\n" +
                                "i sei eine Variable eines Referenztyps mit 'i != null'.\n" +
                                "Welche der folgenden Aussagen treffen für alle F und i zu?",

                        new Choice(false, "Liefert '(F)i' keinen Laufzeitfehler, dann gilt 'i instanceof F'.             (4A)"),
                        new Choice(true, "'i.getClass()' liefert (interne Repr. vom) dynamischen Typ von i.             (4B)"),
                        new Choice(false, "Gilt 'i instanceof F', dann ist F eine Klasse.                                (4C)"),
                        new Choice(false, "Aus 'i instanceof F' folgt: 'i.getClass() == F.class'.                        (4D)"),
                        new Choice(false, "Aus 'i.getClass() == F.class' folgt: 'F ist ein Interface'.                   (4E)")
                ),

                new Question(
                        "u sei eine Referenz auf einen Knoten (Typ 'Node') in einer einfach verketteten Liste\n" +
                                "mit mindestens einem existierenden Nachfolger (in der Objektvariablen 'next').\n" +
                                "Welche der folgenden Anweisungs-Sequenzen entfernen den direkten Nachfolger von u\n" +
                                "aus einer Liste, ändern sonst aber nichts?",

                        new Choice(true, "u.next.next = u.next.next.next;                                               (5A)"),
                        new Choice(false, "u.next.next = u.next;                                                         (5B)"),
                        new Choice(true, "Node p = u.next.next; u.next = p;                                             (5C)"),
                        new Choice(false, "Node m = u; m.next = u.next.next;                                             (5D)"),
                        new Choice(true, "u.next = u.next.next;                                                         (5E)")
                )
        );
    }

// Ende der Multiple-Choice-Fragen

//------------------------------------------------------------
// Bitte lassen Sie den Rest der Datei unverändert.
// Please do not edit below this line.

    private static final String EXPECT = // nochmals die gleichen Fragen zur Selbstkontrolle
            " 1. Welche der folgenden Aussagen gelten in Java für die unterschiedlichen\n" +
                    "    Arten von Variablen und Parametern?\n" +
                    "    \n" +
                    "    XXXXXXXXX Lokale Variablen werden meist als 'private' deklariert.                       (1A)\n" +
                    "    XXXXXXXXX Formale Parameter können Klassenvariablen verdecken.                          (1B)\n" +
                    "    XXXXXXXXX Klassenvariablen werden ohne 'static' deklariert.                             (1C)\n" +
                    "    XXXXXXXXX Parameter und lokale Variablen dürfen nicht gleich heißen.                    (1D)\n" +
                    "    XXXXXXXXX Objektvariablen werden bei Erzeugung des Objekts angelegt.                    (1E)\n" +
                    "\n" +
                    " 2. i sei eine Variable mit einer leeren assoziativen Datenstruktur, wobei Schlüssel\n" +
                    "    und Werte vom Typ 'String' sind (und 'null' sein können).  G und D seien zwei\n" +
                    "    voneinander verschiedene String-Konstanten (static final).  Nach welchen der\n" +
                    "    folgenden Aufruf-Sequenzen liefert 'i.get(G)' den String in D als Ergebnis?\n" +
                    "    \n" +
                    "    XXXXXXXXX i.put(G, D); i.put(i.get(D), i.get(G)); i.put(D, G);                          (2A)\n" +
                    "    XXXXXXXXX i.put(G, G); i.put(i.get(G), i.get(D)); i.put(D, D);                          (2B)\n" +
                    "    XXXXXXXXX i.put(G, D); i.put(G, G); i.put(i.get(G), i.get(D));                          (2C)\n" +
                    "    XXXXXXXXX i.put(G, G); i.put(D, D); i.put(i.get(D), i.get(G));                          (2D)\n" +
                    "    XXXXXXXXX i.put(G, D); i.put(G, G); i.put(D, G);                                        (2E)\n" +
                    "\n" +
                    " 3. r sei eine Variable mit einem einfachen binären Suchbaum (nicht AVL-Baum)\n" +
                    "    ganzer Zahlen, der durch diese Anweisungen aufgebaut wurde:\n" +
                    "        STree r = new STree(); r.add(7); r.add(1); r.add(8);\n" +
                    "    Welche der folgenden Aussagen treffen auf r zu?\n" +
                    "    \n" +
                    "    XXXXXXXXX Der Knoten mit Wert 8 ist Elter von dem mit Wert 7.                           (3A)\n" +
                    "    XXXXXXXXX Der Knoten mit Wert 7 ist Kind von dem mit Wert 1.                            (3B)\n" +
                    "    XXXXXXXXX Der Knoten mit Wert 8 ist ein Blattknoten.                                    (3C)\n" +
                    "    XXXXXXXXX Der Knoten mit Wert 8 ist die Wurzel.                                         (3D)\n" +
                    "    XXXXXXXXX Der Baum hat minimale Tiefe für einen Baum mit 3 Knoten.                      (3E)\n" +
                    "\n" +
                    " 4. F sei ein Referenztyp (Klasse oder Interface), und\n" +
                    "    i sei eine Variable eines Referenztyps mit 'i != null'.\n" +
                    "    Welche der folgenden Aussagen treffen für alle F und i zu?\n" +
                    "    \n" +
                    "    XXXXXXXXX Liefert '(F)i' keinen Laufzeitfehler, dann gilt 'i instanceof F'.             (4A)\n" +
                    "    XXXXXXXXX 'i.getClass()' liefert (interne Repr. vom) dynamischen Typ von i.             (4B)\n" +
                    "    XXXXXXXXX Gilt 'i instanceof F', dann ist F eine Klasse.                                (4C)\n" +
                    "    XXXXXXXXX Aus 'i instanceof F' folgt: 'i.getClass() == F.class'.                        (4D)\n" +
                    "    XXXXXXXXX Aus 'i.getClass() == F.class' folgt: 'F ist ein Interface'.                   (4E)\n" +
                    "\n" +
                    " 5. u sei eine Referenz auf einen Knoten (Typ 'Node') in einer einfach verketteten Liste\n" +
                    "    mit mindestens einem existierenden Nachfolger (in der Objektvariablen 'next').\n" +
                    "    Welche der folgenden Anweisungs-Sequenzen entfernen den direkten Nachfolger von u\n" +
                    "    aus einer Liste, ändern sonst aber nichts?\n" +
                    "    \n" +
                    "    XXXXXXXXX u.next.next = u.next.next.next;                                               (5A)\n" +
                    "    XXXXXXXXX u.next.next = u.next;                                                         (5B)\n" +
                    "    XXXXXXXXX Node p = u.next.next; u.next = p;                                             (5C)\n" +
                    "    XXXXXXXXX Node m = u; m.next = u.next.next;                                             (5D)\n" +
                    "    XXXXXXXXX u.next = u.next.next;                                                         (5E)\n" +
                    "\n";

    public static final long UID = 249245365243215L;

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