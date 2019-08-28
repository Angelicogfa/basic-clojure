(ns clojure.estudo_clojure.file-io)

;; Escrever um arquivo
(defn write_file [file text]
  (spit file text))

(write_file "resources\\Example.txt" "This is a string\nThis is outher string")

;; Leitura de arquivo
(defn read_file [file]
  (def line (slurp file))
  (println line))

(read_file "resources\\Example.txt")

;; Leitura de arquivo linha por linha
(defn read_all_line [file]
  (with-open [rdr (clojure.java.io/reader file)]
    (reduce conj [] (line-seq rdr))))

(read_all_line "resources\\Example.txt")

;; Escrevendo um arquivo uma linha por vez
(defn write_line_file [file text]
  (with-open [w (clojure.java.io/writer file :append true)]
    (.write w text)))

(write_line_file "resources\\Example.txt" "\nNew line")

;; Checar se um arquivo existe
(defn file_exists [file]
  (println (.exists (clojure.java.io/file file))))

(file_exists "resources\\Example.txt")