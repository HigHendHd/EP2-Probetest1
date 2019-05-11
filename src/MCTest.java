// Bitte beantworten Sie die Multiple-Choice-Fragen (maximal 25 Punkte, 1 Punkt pro 'Choice').

public class MCTest {

    // Wenn 'answer' in 'new Choice(...)' für davor stehende 'question' zutrifft, 'valid' bitte auf 'true' ändern.
    // Sonst 'valid' auf 'false' belassen (oder auf 'false' zurückändern).
    // Kommentare sind erlaubt, wirken sich aber nicht auf die Beurteilung aus.
    // Bitte sonst nichts ändern. Zur Kontrolle 'MCTest' ausführen.
    public static void main(String[] args) {
        MCQuestion.checkAndPrint(

                new MCQuestion(
                        "Welche der folgenden Aussagen treffen auf Objektmethoden bzw. Klassenmethoden zu?",

                        new Choice(true, "In Objektmethoden bezeichnet  this  das aktuelle Objekt."),
                        new Choice(false, "Objektmethoden haben Zugriff auf Objekt- und Klassenvariablen."),
                        new Choice(true, "Klassenmethoden haben keinen Zugriff auf Objektvariablen."),
                        new Choice(true, "In Klassenmethoden darf  this  nicht vorkommen."),
                        new Choice(true, "Jede nicht als  static  deklarierte Methode ist eine Objektmethode.")
                ),

                new MCQuestion(
                        "s sei eine Variable mit einem leeren Stack ganzer Zahlen.\n" +
                        "Nach welchen der folgenden Aufruf-Sequenzen liefert  s.peek()  die Zahl  1  als Ergebnis?",

                        new Choice(false, "s.push(3); s.push(1); s.push(2);"),
                        new Choice(false, "s.push(1); s.push(2); s.push(3);"),
                        new Choice(false, "s.push(1); s.push(2); s.push(s.peek());"),
                        new Choice(false, "s.push(1); s.push(s.peek()); s.push(2);"),
                        new Choice(true, "s.push(1); s.push(2); s.push(s.pop());")
                ),

                new MCQuestion(
                        "x sei eine Referenz auf einen Knoten (Typ Node) in einer einfach verketteten Liste\n" +
                        "mit mindestens einem existierenden Nachfolger (in der Objektvariablen next).\n" +
                        "Welche der folgenden Anweisungs-Sequenzen entfernen den direkten Nachfolger von x\n" +
                        "aus einer Liste, ändern sonst aber nichts?",

                        new Choice(true, "x.next = x.next.next;"),
                        new Choice(false, "x.next.next = x.next.next.next;"),
                        new Choice(false, "x.next.next = x.next;"),
                        new Choice(true, "Node n = x.next.next; x.next = n;"),
                        new Choice(false, "Node d = x.next; d = d.next;")
                ),

                new MCQuestion(
                        "Welche der folgenden Aussagen stimmen in Bezug auf rekursive Datenstrukturen?",

                        new Choice(true, "Doppelt verkettete Listen sind in beide Richtungen traversierbar."),
                        new Choice(true, "Zur Fundierung wird meist  null  verwendet."),
                        new Choice(false, "Auch zyklische Datenstrukturen müssen fundiert sein."),
                        new Choice(true, "Eine Datenstruktur ist rekursiv wenn ihre Methoden rekursiv sind."),
                        new Choice(false, "Schleifen erlauben kein vollständiges Traversieren.")
                ),

                new MCQuestion(
                        "Welche der folgenden Aussagen stimmen in Bezug auf dynamisches und statisches Binden?",

                        new Choice(false, "Objektmethoden werden immer dynamisch gebunden."),
                        new Choice(false, "Ein dynamischer Typ ist stets eine Klasse, kein Interface."),
                        new Choice(false, "Dynamisches Binden ist zusammen mit Untertypbeziehungen nötig."),
                        new Choice(true, "Objektmethoden werden in deklarierten Typen von Objekten ausgeführt."),
                        new Choice(false, "'final' Methoden werden immer dynamisch gebunden.")
                )
        );
    }

    public static final long UID = 249265448696034L;

}
