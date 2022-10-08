(ns dev.core
  (:require [taoensso.timbre :as log]))

;; run with  clj -M -m dev.core
(defn -main []
  (log/debug "hello Clojure from DEV"))


;; > clj -X dev.core/print-args :key1 "value1" :key2 "value2"
;; args =  {:key1 value1, :key2 value2} 
(defn print-args [args]
  (log/debug "args = " args))

