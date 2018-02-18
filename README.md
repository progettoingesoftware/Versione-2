# Versione-2
Le risorse multimediali (file) vengono conservate in varie cartelle di un server, una per
ogni categoria di risorse che possono essere concesse in prestito. Una categoria può
articolarsi in più sottocategorie (a un solo livello di profondità), ciascuna delle quali
corrisponde a una sottocartella della cartella relativa alla categoria di riferimento. Se una
cartella - relativa a una categoria - contiene delle sottocartelle, essa non contiene
direttamente delle risorse, cioè le risorse sono tutte collocate nelle sottocartelle. Una
risorsa è collocata in una singola (sotto)cartella, cioè non esistono più copie della
medesima risorsa collocate in (sotto)cartelle distinte.
L’applicazione non deve occuparsi delle (sotto)cartelle del server né dei file in esse
contenuti. L’applicazione deve invece occuparsi della conservazione di un “archivio”
persistente locale che descriva le risorse multimediali, classificate per categorie ed
eventuali sottocategorie, riflettendo la suddivisione delle risorse presenti sul server.
Ciascuna risorsa è dotata di un suo numero di licenze d’uso (perenni), che può differire
da quello di altre risorse. Esistono alcune informazioni che caratterizzano ciascuna
risorsa, dipendenti dalla categoria della risorsa stessa. La seconda versione
dell’applicazione considera una sola categoria di risorse, i libri. Ciascun libro è descritto
da vari campi, ad esempio, titolo, autore/i, numero di pagine, anno di pubblicazione, casa
editrice, lingua, genere.
La versione corrente dell’applicazione deve consentire all’operatore di archiviare le
descrizioni delle risorse e visualizzare il contenuto dell’archivio, secondo le specifiche
seguenti:
 aggiunta (della descrizione) di una risorsa, completa in ogni suo campo, a una
(sotto)categoria in archivio;
 rimozione (della descrizione) di una risorsa dall’archivio;
 visualizzazione dell’elenco delle risorse per (sotto)categoria.
