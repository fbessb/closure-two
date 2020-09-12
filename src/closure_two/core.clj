(ns closure-two.core
  (:gen-class))
(declare test-args)

(defn -main
 "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World! At last II")
  (println (test-args (first args)))
)

(defn test-args [value]
  (if (= value "Zoom") 
      (println "Zoom Ok")
      (println "Zoom Nok")
  )
)
