# bem-classnames

A small clojure library to generate [BEM](http://getbem.com/) classnames à la some [react libraries](https://github.com/pocotan001/bem-classnames)

## Usage

```clojure
(def b (block "block")) ;; "block"
(def be (block "block" "element")) ;; "block__element"
(def bem (block "block" "element" {:modifier true
                                   :not-me false})) ;; "block__element--modifier"
                                
;; via partial application
(def b (block "block")) ;; Function
(def be (b "element" {})) ;; "block__element"
```

## License

Copyright © 2017 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
