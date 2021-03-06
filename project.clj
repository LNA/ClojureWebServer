(defproject clj_http_server "0.1.0-SNAPSHOT"
  :description "A simple http server"
  :url "Github.com/LNA"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/tools.cli "0.3.1"]]
  :profiles {:dev {:dependencies [[speclj "3.0.1"]]}}
  :plugins [[speclj "3.0.1"]]
  :test-paths ["spec"]
  :main clj_http_server.runner
  :java-source-path "src/")
