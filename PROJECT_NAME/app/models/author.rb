class Author < ApplicationRecord
    has_many :books

    validates :authorname, presence: true
    validates :createdby, presence: true
end
