(ns clj_http_server.parser_spec
  (:require [speclj.core :refer :all]
    [clj_http_server.parser :refer :all]))

(describe "parser"
          (it "Gives the args"
          (should= 8675309 (parse ))))
