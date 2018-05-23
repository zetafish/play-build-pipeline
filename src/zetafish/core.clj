(ns zetafish.core
  (:require [org.httpkit.server :as web]
            [cheshire.core :as json]
            [mount.core :as mount]
            [ring.util.http-response :as r]
            [compojure.core :refer [GET POST context]]))

(def app
  (context "/" []
    (GET "/" []
      (r/ok (json/encode {:version "1"})))))

(mount/defstate server
  :start (web/run-server (-> #'app) {:port 5000}))


#_ (mount/start)
