# Mostra Canina

Applicazione di ausilio ad una mostra canina.  
Essa permette:
- Archiviazione anagrafica del Cane con relativo padrone
- Votazione del cane partecipante al concorso  

Funzionalità integrate (Endpoint):
- Lista di cani riportante il codice, nome e la data di nascita dei cani ordinati dal più vecchio al più giovane;  
    - GET  
- Dato il nome del cane riportare i dati del proprietario: id, nome e cognome  
    - GET - param: nome del cane  
- estrarre il codice del cane, il suo nome ed il punteggio medio ottenuto dal vincitore di un determinato concorso (a parità di punteggio vince il cane che meno si discosta dai valori standard della propria razza);  
    - GET - param: concorso  
- estrarre nome e cognome del giudice (o dei giudici) che in un determinato concorso ha mediamente dato i voti più bassi;  
    - GET - param: concorso  
- individuare il cane o i cani (codice, nome, data di nascita) più giovane/i;  
    - GET  
- Per ogni concorso individuare la/e razza/e che non vi hanno partecipato  
    - GET  
