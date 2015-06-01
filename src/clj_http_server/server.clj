(ns clj_http_server.server
  (:import (java.net ServerSocket SocketException)
           (java.io BufferedReader DataOutputStream PrintWriter InputStreamReader StringWriter))
  (:require [clojure.java.io :as io]))

(defn writer [open-socket]
  (let [writer (DataOutputStream. (.getOutputStream open-socket))]
    writer))

(defn reader [open-socket]
  (let [reader (BufferedReader. (InputStreamReader. (.getInputStream open-socket)))]
    reader))

(defn server-io [server-socket]
  (let [open-socket (.accept server-socket)
        reader (reader open-socket)
        writer (writer open-socket)]
  (prn "Accepted connection, created reader and writer.")))

(defn create-socket [port]
  (ServerSocket. port))

(defn start [port]
  (let [server-socket (create-socket port)]
    (while (not (.isClosed server-socket))
      (try
        (prn "Starting the server")
        (server-io server-socket)
        (catch Exception e)))))
