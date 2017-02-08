(require '[cljs.build.api :as b])

(b/watch "src"
  {:main 'emojize-chrome-extention.core
   :output-to "out/emojize_chrome_extention.js"
   :output-dir "out"})
