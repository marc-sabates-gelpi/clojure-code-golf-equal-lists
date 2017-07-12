(defproject equal-lists "0.1.0-SNAPSHOT"
  :description "Code golf: Are these lists equal? https://codegolf.stackexchange.com/questions/117127/are-these-lists-equal"
  :url "http://example.com/FIXME"
  :license {:name "GNU General Public License (GPL) version 3"
            :url "https://www.gnu.org/licenses/gpl.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot equal-lists.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
