(ns demo.views)

(defn greeting [] [:p "Hello World"])

(defn app [] [:<> [:h1 "Demo App on Netlify"] [greeting]])
