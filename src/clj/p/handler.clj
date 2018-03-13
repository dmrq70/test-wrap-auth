(ns p.handler
  (:require [compojure.core :refer [routes wrap-routes]]
            [p.layout :refer [error-page]]
            [p.routes.home :refer [home-routes]]
            [p.routes.services :refer [public-service-routes authorized-service-routes]]
            [compojure.route :as route]
            [p.env :refer [defaults]]
            [mount.core :as mount]
            [p.middleware :as middleware]))

(mount/defstate init-app
                :start ((or (:init defaults) identity))
                :stop  ((or (:stop defaults) identity)))

(def app-routes
  (routes
   (wrap-routes #'authorized-service-routes middleware/wrap-auth)
   #'public-service-routes
   ))


(defn app [] (middleware/wrap-base #'app-routes))
