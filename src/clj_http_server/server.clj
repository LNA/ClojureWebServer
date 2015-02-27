(ns clj_http_server.server
  (:import [java.io BufferedReader DataOutputStream
            InputStreamReader BufferedOutputStream]
           [java.net ServerSocket Socket SocketException])
  (:require [clojure.java.io :as io]))

(defn run []
  (prn "Starting the server")
  )
