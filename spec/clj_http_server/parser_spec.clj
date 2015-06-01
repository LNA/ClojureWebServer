(ns clj_http_server.parser_spec
  (:require [speclj.core :refer :all]
    [clj_http_server.parser :as :p]))

(describe "parser"
   (it "Gives an int for the port string"
      (should= 8675309
         (p/parse ["-p" "8675309"]))))
