(ns clj_http_server.server
  (:import (java.net ServerSocket SocketException)
                      (java.io BufferedReader PrintWriter InputStreamReader StringWriter))
  (:require [clojure.java.io :as io]))

(defn create-socket [port]
  (ServerSocket. port))

(defn start [port]
  (let [server-socket (create-socket port)]
    (while (not (.isClosed server-socket))
  (prn "Starting the server")
  )))
