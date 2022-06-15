(ns take-stock.web
  (:require [compojure.core :refer [defroutes GET]]
            [ring.adapter.jetty :as ring]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]])
  (:gen-class))

(defroutes routes
  (GET "/" [] "<h2>Hello World</h2>"))

(def application (wrap-defaults routes site-defaults))

(defn -main []
  (ring/run-jetty application {:port 8080 :join? false}))