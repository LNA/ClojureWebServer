(ns clj_http_server.runner
  (:require [clj_http_server.parser   :as p]
            [clj_http_server.server   :as server])
  (:gen-class :main true))

( defn -main [& args]
  (let [parsed-args (p/parse args)]
  (println "Waiting for requests...")
  (println "The args are: "  args)
  (println "And have been parsed to: " parsed-args))
  (server/start 5000))

