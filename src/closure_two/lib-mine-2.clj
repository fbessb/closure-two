; some example of libraries just for me.
(defn validate-args [value]
    (if (= (first value) "Zoom")
        (println "Zoom Ok (II)")
        (println "Zoom Nok (II)")
    )
)

(defn test-args [value]
    (if (= value "Zoom") 
        (println "Zoom Ok")
        (println "Zoom Nok")
    )
  )