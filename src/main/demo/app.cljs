(ns demo.app
  (:require [demo.views :as views]
            ; [reagent.core :as r]
            [reagent.dom :as rdom]
            ["react" :as react]))

(defn ^:dev/after-load start
  []
  (js/console.log (.-version react))
  (rdom/render [views/app] (js/document.getElementById "app")))

(defn ^:export init
  []
  ;; init is called ONCE when the page loads this is called in the
  ;; index.html and must be exported so it is available even in :advanced
  ;; release builds
  (start))
