(defproject bem-classnames "0.1.0-SNAPSHOT"
 :description "Small utility library for generating BEM-style classnames"
 :url "https://github.com/James-Oldfield/bem-classnames"
 :license {:name "MIT"
           :url ""}
 :dependencies [[org.clojure/clojure "1.8.0"]]
 :main ^:skip-aot bem-classnames.core
 :target-path "target/%s"
 :profiles {:uberjar {:aot :all}})
