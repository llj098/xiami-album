# xiami-album

find the top rank albums in xiami.com

## Usage

 lein run -m xiami-album.core start_id end_id min_rank

for example, this will find the albums which between id 1 - 100 whose rank is larger than 8

 lein run -m xiami-album.core 1 100 8
 
## License

Copyright © 2013 FIXME

Distributed under the Eclipse Public License, the same as Clojure.
