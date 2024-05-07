(defproject hydra-clj "0.1.0-SNAPSHOT"
  :author "Megh Khaire"
  :description "Wrapper for switching between LLM providers"
  :license {:name "The MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies
  [[org.clojure/clojure "1.11.2"]
   [cheshire "5.12.0"]
   [metosin/malli "0.15.0"]
   [stencil "0.5.0"]
   [http-kit "2.7.0"]
   [net.mikera/core.matrix "0.63.0"]
   [circleci/bond "0.6.0"]])
