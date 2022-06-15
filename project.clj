(defproject take-stock "0.1.0-SNAPSHOT"
  :description "Inventory management app"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [org.clojure/java.jdbc "0.6.1"]
                 [org.postgresql/postgresql "9.4-1201-jdbc41"]
                 [ring/ring-jetty-adapter "1.4.0"]
                 [compojure "1.4.0"]
                 [ring/ring-defaults "0.1.2"]]
  :main ^:skip-aot take-stock.web
  :target-path "target/%s"
  :uberjar-name "take-stock-standalone.jar"
  :plugins [[lein-ring "0.8.13"]]
  :ring {:handler take-stock.web/application}
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
