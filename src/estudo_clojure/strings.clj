(ns clojure.estudo_clojure.strings
  (:gen-class))

;; Concatenar string
(defn concat_string [values]
  (println (str values)))

(concat_string ["Hello world"])

;; Formatar texto
(defn format_text [value fields]
  (println (format value fields)))

(format_text "Hello, %s" "world")
(format_text "Pad with leading zeros %06d" 1234)

;; Contar caracteres em uma string
(defn count_string [value]
  (println "Values count" (count value)))

(count_string "Hello world")

;; Retorna uma substring 
(defn sub_string [value start end]
  (println (subs value start end)))

(sub_string "Hello world" 0 5)

;; Compara duas string
(defn compare_string [value1 value2]
  (println (compare value1 value2)))

(compare_string "Hello" "hello")
(compare_string "Hello" "Hello")
(compare_string "hello" "Hello")

;; Converte a string lower-case
(defn string_lower_case [value]
  (println (clojure.string/lower-case value)))

(string_lower_case "HELLO WORLD")

;; Converter a string upper-case
(defn string_upper_case [value]
  (println (clojure.string/upper-case value)))

(string_upper_case "hello world")

;; Junta um array em uma string
(defn join_string [array separator]
  (println (clojure.string/join separator array)))

(join_string [1 2 3 4] ",")

;; Fragmenta uma string com base em uma expressão
(defn split_string [value sep]
  (println (clojure.string/split value sep)))

(split_string "This car is red and clound is white" #" ")

;; Fragmenta a linha de acordo com caracteres de escape \n \r\n
(defn split_string_scape [value]
  (println (clojure.string/split-lines value)))

(split_string_scape "Hello \nWorld")

;; Inverte uma string
(defn reverse_string [value]
  (println (clojure.string/reverse value)))

(reverse_string "Hello world")

;; Repassa o valor de uma string
(defn replace_string [value old new]
  (println (clojure.string/replace value old new)))

(replace_string "The tutorial is about groovy" "groovy" "clojure")

;; Remove os espaços em branco
(defn trim_string [value]
  (println (clojure.string/trim value)))

(trim_string " White space ")

(defn triml_string [value]
  (println (clojure.string/triml value)))

(triml_string " White space ")

(defn trimr_string [value]
  (println (clojure.string/trimr value)))

(trimr_string " White space ")