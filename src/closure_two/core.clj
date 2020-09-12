; HEADER of this file
; =====================

(ns closure-two.core
  (:gen-class))
(load-file "src/closure_two/lib-mine.clj")
(declare test-args)

(defn -main
 "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World! At last II")
  (println (test-args (first args)))
  (validate-args args)
)


