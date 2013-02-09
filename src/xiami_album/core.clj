(ns xiami-album.core
 (:require [net.cgrand.enlive-html :as html]))

(use 'clojure.pprint)  

(defn get-point [res]
  (let [s (first (html/texts (html/select res [:div#album_rank :> :p :> :em])))]
    (if (= "" s)
      0
      (read-string s))))

(defn fetch-url [url]
  (html/html-resource (java.net.URL. url)))

(defn -main [s e m]
    (loop [x (read-string s)]
        (if (< x (read-string e))
          (do
            (try                     
              (let [url (str "http://www.xiami.com/album/" x)
                    point (get-point (fetch-url url))]
                (if (> point (read-string m))
                  (println url point)))
              (catch Exception e))
            (recur (inc x))))))




