Rails.application.routes.draw do
  use_doorkeeper
  devise_for :users
  # Define your application routes per the DSL in https://guides.rubyonrails.org/routing.html

  # Defines the root path route ("/")
  # root "articles#index"
  #get "/spinner", to: "spinner#index"
  get "/api/v1/authors", to: "authors#index"
  get "/api/v1/authors/:id", to: "authors#show"
  post "/api/v1/authors", to: "authors#create"
  patch "/api/v1/authors/:id", to: "authors#update"
  delete "/api/v1/authors/:id", to: "authors#destroy"

  #resources :authors

  resources :authors do
    resources :books
  end

  #get "/api/v1/books", to: "books#index"
  #get "/api/v1/books/:id", to: "books#show"
  #post "/api/v1/authors", to: "books#create"
  #patch "/api/v1/books/:id", to "books#update"
  #delete "/api/v1/books/:id", to "books#delete"

  root "authors#index"
  
end
