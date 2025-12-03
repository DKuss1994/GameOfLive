Game of Life in Java

Dieses Projekt ist eine Java-Umsetzung des klassischen Conway's Game of Life. Es simuliert die Entwicklung von Zellen auf einem zweidimensionalen Spielfeld nach den bekannten Regeln der Überpopulation, Unterpopulation und Wiedergeburt.

Funktionen

Benutzerdefinierte Spielfeldgröße (Höhe und Breite)

Interaktive Platzierung der lebenden Zellen durch den Benutzer

Darstellung des Spielfeldes im Terminal

Automatischer Zyklus für die Entwicklung der Zellen

Logik für Überleben, Überpopulation, Unterpopulation und Wiedergeburt

Einheitstests zur Überprüfung der Spielfeldgenerierung und der Regeln

Klassenübersicht

GameOfLive
Einstiegspunkt des Programms. Startet das Spiel durch Initialisierung von GameManager.

GameManager
Verwaltet den Spielablauf:

Abfrage der Spielfeldgröße

Platzierung der Zellen

Start der Spielzyklen

InstructionGameOfLive
Beinhaltet die Kernlogik der Zellregeln:

Überprüfung der Nachbarn

Regeln für Überleben, Unterpopulation, Überpopulation und Wiedergeburt

SystemSettingsGameOfLive
Verwaltung des Spielfeldes:

Erstellen des Feldes

Aktualisierung nach jedem Zyklus

Darstellung des Feldes im Terminal

UserQuestion
Interaktive Eingabe der Benutzer:

Höhe und Breite des Spielfeldes

Platzierung der Zellen

Möglichkeit das Spiel zu stoppen

GameOfLiveTest
JUnit-Tests zur Überprüfung der Spielfeldlogik und der Regeln

Spielregeln

Jede Zelle hat bis zu 8 Nachbarn.

Eine lebende Zelle mit weniger als 2 Nachbarn stirbt (Unterpopulation).

Eine lebende Zelle mit 2 oder 3 Nachbarn überlebt.

Eine lebende Zelle mit mehr als 3 Nachbarn stirbt (Überpopulation).

Eine tote Zelle mit genau 3 Nachbarn wird lebendig (Wiedergeburt).

Nutzung

Projekt mit Java 17 oder höher kompilieren.

javac -d out src/main/java/org/example/*.java


Spiel starten:

java -cp out org.example.GameOfLive


Befolgen Sie die Anweisungen im Terminal, um:

Spielfeldgröße festzulegen

Zellen zu platzieren

Das Spiel zu starten und zu stoppen

Beispielhafte Darstellung im Terminal
[■,  ,  ,  , ■]
[ , ■,  , ■,  ]
[ ,  , ■,  ,  ]
-----------------

Tests

JUnit Tests sind enthalten, um sicherzustellen:

Korrekte Erstellung des Spielfeldes

Funktion der Zellregeln

Nachbarzählung korrekt

Tests können mit Maven oder direkt in der IDE ausgeführt werden.
