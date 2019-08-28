(ns clojure.estudo_clojure.strings)

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

