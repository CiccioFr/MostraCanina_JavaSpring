# Mostra Canina

Applicazione di ausilio ad una mostra canina.  
Essa permette:

- Archiviazione anagrafica del Cane con relativo padrone
- Votazione del cane partecipante al concorso

Funzionalità integrate (Endpoint):

1. Lista di cani riportante il codice, nome e la data di nascita dei cani ordinati dal più vecchio al più giovane;
    - Tipo `GET`
    - URL:  localhost:8083/mostra_canina/concorrenti

2. Dato il nome del cane riportare i dati del proprietario: id, nome e cognome
    - Tipo `GET` - param: nome del cane
    - URL:  localhost:8083/mostra_canina/proprietario/{nomeCane}

3. estrarre il codice del cane, il suo nome ed il punteggio medio ottenuto dal vincitore di un determinato concorso (a
   parità di punteggio vince il cane che meno si discosta dai valori standard della propria razza);
    - Tipo `GET` - param: concorso
    - URL:  localhost:8083/mostra_canina

4. estrarre nome e cognome del giudice (o dei giudici) che in un determinato concorso ha mediamente dato i voti più
   bassi;
    - Tipo `GET` - param: concorso
    - URL:  localhost:8083/mostra_canina

5. individuare il cane o i cani (codice, nome, data di nascita) più giovane/i;
    - Tipo `GET`
    - URL:  localhost:8083/mostra_canina

6. Per ogni concorso individuare la/e razza/e che non vi hanno partecipato
    - Tipo `GET`
    - URL:  localhost:8083/mostra_canina
