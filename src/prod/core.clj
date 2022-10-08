(ns prod.core
  (:require [taoensso.timbre :as log])
  (:gen-class))

;; run with  clj -M .\src\script.clj 1 2 3
(defn -main []
  (log/debug "hello Clojure from PROD"))


;; > clj -X dev.core/print-args :key1 "value1" :key2 "value2"
;; args =  {:key1 value1, :key2 value2} 
(defn print-args [args]
  (log/debug "args = " args))

