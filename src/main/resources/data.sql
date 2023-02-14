INSERT INTO `giudice` (`id_giudice`, `nome`, `cognome`)
VALUES (1, 'GIUDICE', 'UNO'),
       (2, 'GIUDICE', 'DUE'),
       (3, 'GIUDICE', 'TRE'),
       (4, 'GIUDICE', 'QUATTRO');

INSERT INTO `mostra_canina` (`nome_mostra`, `anno`)
VALUES ('ALANO GRAN PRIX', 2021),
       ('ALANO GRAN PRIX', 2022);


INSERT INTO `proprietario` (`id_proprietario`, `nome`, `cognome`)
VALUES (1, 'Mario', 'Bianchi'),
       (2, 'Sara', 'Verdi'),
       (3, 'Francesco', 'Rossi'),
       (4, 'Isabella', 'Neri'),
       (5, 'Felice', 'Cremisi');

INSERT INTO `razza` (`codice_razza`, `nome_razza`, `peso_standard`, `altezza_standard`)
VALUES (18, 'ALANO', '82.00', 80),
       (23, 'BEAGLE', '28.00', 33),
       (58, 'GRANDE BOVARO SVIZZERO', '65.00', 72),
       (74, 'FOX TERRIER A PELO LISCIO', '8.00', 40);


INSERT INTO `cane` (`codice_cane`, `nome`, `data_nascita`, `altezza`, `peso`, `id_proprietario`, `codice_razza`)
VALUES ('J873DER5TG', 'Fufi', '2015-02-24', 81, '80.30', 5, 18),
       ('P87FVC3WS4', 'King', '2018-11-04', 80, '80.20', 3, 18),
       ('W478HNBF50', 'Fido', '2016-03-24', 79, '79.50', 2, 18),
       ('Y68MJF34DE', 'Bau', '2018-06-14', 81, '80.60', 1, 18),
       ('Z388R5F04', 'Zeus', '2019-08-23', 71, '66.10', 5, 58),
       ('ZCR5TG432A', 'Fufi Jr.', '2018-09-27', 81, '79.90', 4, 18);

INSERT INTO `voti` (`nome_mostra`, `anno`, `id_giudice`, `codice_cane`, `voto`)
VALUES ('ALANO GRAN PRIX', 2021, 1, 'J873DER5TG', '9.9'),
       ('ALANO GRAN PRIX', 2021, 1, 'P87FVC3WS4', '9.7'),
       ('ALANO GRAN PRIX', 2021, 1, 'W478HNBF50', '9.4'),
       ('ALANO GRAN PRIX', 2021, 1, 'Y68MJF34DE', '9.4'),
       ('ALANO GRAN PRIX', 2021, 1, 'Z388R5F04', '9.5'),
       ('ALANO GRAN PRIX', 2021, 1, 'ZCR5TG432A', '9.6'),
       ('ALANO GRAN PRIX', 2021, 2, 'J873DER5TG', '9.7'),
       ('ALANO GRAN PRIX', 2021, 2, 'P87FVC3WS4', '10.0'),
       ('ALANO GRAN PRIX', 2021, 2, 'W478HNBF50', '9.4'),
       ('ALANO GRAN PRIX', 2021, 2, 'Y68MJF34DE', '9.4'),
       ('ALANO GRAN PRIX', 2021, 2, 'Z388R5F04', '9.3'),
       ('ALANO GRAN PRIX', 2021, 2, 'ZCR5TG432A', '9.6'),
       ('ALANO GRAN PRIX', 2021, 3, 'J873DER5TG', '9.6'),
       ('ALANO GRAN PRIX', 2021, 3, 'P87FVC3WS4', '9.2'),
       ('ALANO GRAN PRIX', 2021, 3, 'W478HNBF50', '9.5'),
       ('ALANO GRAN PRIX', 2021, 3, 'Y68MJF34DE', '9.7'),
       ('ALANO GRAN PRIX', 2021, 3, 'Z388R5F04', '9.8'),
       ('ALANO GRAN PRIX', 2021, 3, 'ZCR5TG432A', '9.8'),
       ('ALANO GRAN PRIX', 2021, 4, 'J873DER5TG', '9.5'),
       ('ALANO GRAN PRIX', 2021, 4, 'P87FVC3WS4', '9.8'),
       ('ALANO GRAN PRIX', 2021, 4, 'W478HNBF50', '9.1'),
       ('ALANO GRAN PRIX', 2021, 4, 'Y68MJF34DE', '9.3'),
       ('ALANO GRAN PRIX', 2021, 4, 'Z388R5F04', '9.8'),
       ('ALANO GRAN PRIX', 2021, 4, 'ZCR5TG432A', '9.7'),
       ('ALANO GRAN PRIX', 2022, 1, 'J873DER5TG', '9.8'),
       ('ALANO GRAN PRIX', 2022, 1, 'P87FVC3WS4', '9.7'),
       ('ALANO GRAN PRIX', 2022, 1, 'W478HNBF50', '9.7'),
       ('ALANO GRAN PRIX', 2022, 1, 'Y68MJF34DE', '9.8'),
       ('ALANO GRAN PRIX', 2022, 1, 'Z388R5F04', '9.6'),
       ('ALANO GRAN PRIX', 2022, 1, 'ZCR5TG432A', '9.6'),
       ('ALANO GRAN PRIX', 2022, 2, 'J873DER5TG', '9.7'),
       ('ALANO GRAN PRIX', 2022, 2, 'P87FVC3WS4', '9.5'),
       ('ALANO GRAN PRIX', 2022, 2, 'W478HNBF50', '9.7'),
       ('ALANO GRAN PRIX', 2022, 2, 'Y68MJF34DE', '9.1'),
       ('ALANO GRAN PRIX', 2022, 2, 'Z388R5F04', '9.3'),
       ('ALANO GRAN PRIX', 2022, 2, 'ZCR5TG432A', '9.9'),
       ('ALANO GRAN PRIX', 2022, 3, 'J873DER5TG', '10.0'),
       ('ALANO GRAN PRIX', 2022, 3, 'P87FVC3WS4', '9.7'),
       ('ALANO GRAN PRIX', 2022, 3, 'W478HNBF50', '9.7'),
       ('ALANO GRAN PRIX', 2022, 3, 'Y68MJF34DE', '9.8'),
       ('ALANO GRAN PRIX', 2022, 3, 'Z388R5F04', '9.5'),
       ('ALANO GRAN PRIX', 2022, 3, 'ZCR5TG432A', '10.0'),
       ('ALANO GRAN PRIX', 2022, 4, 'J873DER5TG', '9.3'),
       ('ALANO GRAN PRIX', 2022, 4, 'P87FVC3WS4', '9.5'),
       ('ALANO GRAN PRIX', 2022, 4, 'W478HNBF50', '9.5'),
       ('ALANO GRAN PRIX', 2022, 4, 'Y68MJF34DE', '9.7'),
       ('ALANO GRAN PRIX', 2022, 4, 'Z388R5F04', '9.0'),
       ('ALANO GRAN PRIX', 2022, 4, 'ZCR5TG432A', '9.7');
