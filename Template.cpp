#include <bits/stdc++.h>
using ll = long long;
using namespace std;

/* For Rectangle Geometry */
struct Rect{
    ll x1, y1, x2, y2;
    ll area(){
        return (y2 - y1) * (x2 - x1);
    }
};

ll intersect(Rect p, Rect q) {
    ll xOverlap = max(0LL, min(p.x2, q.x2) - max(p.x1, q.x1));
    ll yOverlap = max(0LL, min(p.y2, q.y2) - max(p.y1, q.y1));
    return xOverlap * yOverlap;
}


void setIO(string s) {
  freopen((s + ".in").c_str(), "r", stdin);
  freopen((s + ".out").c_str(), "w", stdout);
}

int main(){
  setIO("");
  ios::sync_with_stdio(false);
  cin.tie(nullptr);
  
  return 0;
}

