(set-env!
  :resource-paths #{"src"}
  :dependencies '[[org.clojure/clojure "1.9.0" :scope "provided"]
                  [cheshire "5.8.0"]
                  [camel-snake-kebab "0.4.0"]
                  [mount "0.1.12"]
                  [http-kit "2.3.0"]
                  [com.taoensso/timbre "4.10.0"]
                  [compojure "1.6.1"]
                  [metosin/ring-http-response "0.9.0"]])

#_(deftask build
  []
  (comp
    (aot :namespace #{'play.core})
    (pom :version "0.1.0-SNAPSHOT"
         :project 'play/core)
    (uber)
    (jar :main 'play.core)
    (target)))
